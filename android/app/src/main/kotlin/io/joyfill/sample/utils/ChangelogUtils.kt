package io.joyfill.sample.utils

import joyfill2.events.ChangeLog
import joyfill2.events.FieldUpdateChange
import joyfill2.utils.toJsonObject
import kotlinx.serialization.json.Json

/**
 * Processes a changelog and returns its JSON string representation with URL truncation
 * to prevent OOM errors from large base64 data URLs.
 */
internal fun ChangeLog.toSafeJsonString(): String {
    if (change !is FieldUpdateChange) {
        return toJsonString()
    }
    
    val value = (change as FieldUpdateChange).value
    
    // check if its a MutableList<MutableMap<String, Any?>> (like image attachments)
    if (value !is MutableList<*> || !value.all { it is MutableMap<*, *> }) {
        return toJsonString()
    }
    
    @Suppress("UNCHECKED_CAST")
    val listValue = value as MutableList<MutableMap<String, Any?>>
    
    var needsModification = false
    val modifiedList = listValue.map { map ->
        val urlValue = map["url"]
        if (urlValue is String) {
            when {
                // For data URLs (base64), truncate after 100 characters to prevent OOM
                urlValue.startsWith("data:") && urlValue.length > 100 -> {
                    needsModification = true
                    map.toMutableMap().apply {
                        this["url"] = urlValue.take(100) + "...[truncated data URL]"
                    }
                }
                // For regular URLs, truncate after 50 characters
                urlValue.length > 50 -> {
                    needsModification = true
                    map.toMutableMap().apply {
                        this["url"] = urlValue.take(50) + "..."
                    }
                }
                else -> map
            }
        } else {
            map
        }
    }.toMutableList()
    
    return if (needsModification) {
        val modifiedChangelogMap = toMap().toMutableMap()
        val changeMap = (modifiedChangelogMap["change"] as MutableMap<String, Any?>).toMutableMap()
        changeMap["value"] = modifiedList
        modifiedChangelogMap["change"] = changeMap
        
        val jsonObject = modifiedChangelogMap.toJsonObject()
        Json.encodeToString(jsonObject)
    } else {
        toJsonString()
    }
} 