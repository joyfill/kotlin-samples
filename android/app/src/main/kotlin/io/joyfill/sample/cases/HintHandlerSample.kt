package io.joyfill.sample.cases

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.JSONUtils
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.ComponentEvent
import joyfill2.Form
import joyfill2.editors.document.helper.update
import joyfill2.rememberDocumentEditor
import joyfill2.table.Column
import joyfill2.utils.Option
import kiota.File
import kiota.FileManager
import kiota.file.mime.Image
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * A sample demonstrating automatic hint population based on device type selection.
 * When a user selects a device type in the "Alarm Devices" table, the corresponding
 * hint values are automatically populated from the hidden "Hints" table.
 */
@OptIn(ExperimentalEncodingApi::class)
@Composable
internal fun HintHandlerSample(files: FileManager) = ThemedSample {
    var dynamicJson by remember { mutableStateOf(JSONUtils.hintAndDeficiencyDemo()) }

    val editor = rememberDocumentEditor(json = dynamicJson)

    fun populateHints(selectedDeviceTypeId: Option, rowId: String) {
        val hintsTable = editor.fields.table("Hints")

        if (hintsTable != null) {
            val hintRow = hintsTable.rows.all().find { row ->
                row.dropdown("Device Type")?.state?.value?.data?.id == selectedDeviceTypeId.id
            }

            if (hintRow != null) {
                val visualInspectionHint = hintRow.block("Visual Inspection Hint")?.state?.value?.data
                val functionalTestHint = hintRow.block("Functional Test Hint")?.state?.value?.data

                val alarmDevicesTable = editor.fields.table("Alarm Devices")
                if (alarmDevicesTable != null) {
                    val visualHintColumn = alarmDevicesTable.columns.block("Visual Inspection Hint")
                    val functionalHintColumn = alarmDevicesTable.columns.block("Functional Test Hint")

                    val cellUpdates = mutableMapOf<Column, Any?>()
                    visualHintColumn?.let { column ->
                        cellUpdates[column] = visualInspectionHint
                    }
                    functionalHintColumn?.let { column ->
                        cellUpdates[column] = functionalTestHint
                    }

                    if (cellUpdates.isNotEmpty()) {
                        editor.update(
                            fieldId = alarmDevicesTable.id,
                            cellUpdates = cellUpdates,
                            rowId = rowId
                        )
                    }
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Form(
            editor = editor,
            onUpload = {
                when (val result = files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                    is File -> listOf(files.toBase64Url(result))
                    else -> listOf(randomImageUrl())
                }
            },
            onFieldChange = { event ->
                if (event is ComponentEvent.CellEvent &&
                    event.source?.component?.title == "Device Type"
                ) {

                    // Get the table name from the event
                    val table = editor.fields.table("Alarm Devices")
                    if (table != null) {
                        val row = table.rows.find(event.rowId)
                        val selectedOption = row?.dropdown("Device Type")?.state?.value?.data

                        if (selectedOption != null) {
                            populateHints(selectedOption, event.rowId)
                        }
                    }
                }
            }
        )
    }
} 