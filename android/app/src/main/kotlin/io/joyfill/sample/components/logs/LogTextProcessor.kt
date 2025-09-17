package io.joyfill.sample.components.logs

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

internal object LogTextProcessor {
    private const val MAX_PREVIEW_LENGTH = 300
    private const val LONG_TEXT_THRESHOLD = 1000
    internal const val LINES_PER_BATCH = 30
    private const val MAX_CHARS_PER_LINE = 1000

    @OptIn(ExperimentalSerializationApi::class)
    private val jsonFormatter = Json {
        prettyPrint = true 
        prettyPrintIndent = "    "
    }

    internal fun formatJsonText(
        text: String,
        logType: LogType,
    ): String {
        return try {
            val jsonElement = Json.parseToJsonElement(text)
            val formattedJson = jsonFormatter.encodeToString(JsonElement.serializer(), jsonElement)
            val lines = formattedJson.lines()
            val firstLine = lines.firstOrNull() ?: ""
            val remainingLines = lines.drop(1)

            val prefix = when (logType) {
                LogType.CHANGE_LOG -> "onChange"
                LogType.ERROR_LOG -> "onError"
            }

            "$prefix: $firstLine\n${remainingLines.joinToString("\n")}"
        } catch (e: Exception) {
            text
        }
    }

    internal fun createPreview(formattedText: String): String {
        return if (formattedText.length > MAX_PREVIEW_LENGTH) {
            try {
                val endIndex = formattedText.take(MAX_PREVIEW_LENGTH)
                    .lastIndexOf('}')
                    .takeIf { it > 0 }
                    ?: MAX_PREVIEW_LENGTH
                
                formattedText.take(endIndex + 1) + "\n  ..."
            } catch (e: Exception) {
                formattedText.take(MAX_PREVIEW_LENGTH) + "..."
            }
        } else {
            formattedText
        }
    }

    internal fun processLinesForDisplay(text: String): List<String> {
        val rawLines = text.lines()
        val processed = mutableListOf<String>()
        
        rawLines.forEach { line ->
            if (line.length <= MAX_CHARS_PER_LINE) {
                processed.add(line)
            } else {
                var remaining = line
                while (remaining.isNotEmpty()) {
                    val chunk = remaining.take(MAX_CHARS_PER_LINE)
                    processed.add(chunk)
                    remaining = remaining.drop(MAX_CHARS_PER_LINE)
                }
            }
        }
        
        return processed
    }

    internal fun getVisibleLines(
        processedLines: List<String>, 
        loadedBatches: Int
    ): Pair<List<String>, Boolean> {
        val totalLines = processedLines.size
        val linesToShow = minOf(loadedBatches * LINES_PER_BATCH, totalLines)
        val displayLines = processedLines.take(linesToShow)
        val hasMore = linesToShow < totalLines
        return displayLines to hasMore
    }

    internal fun isLongText(text: String): Boolean = text.length > LONG_TEXT_THRESHOLD
} 