package io.joyfill.sample.samples

import androidx.compose.runtime.Composable
import io.joyfill.sample.utils.JSONUtils
import io.joyfill.sample.utils.randomImageUrl
import joyfill.ComponentEvent
import joyfill.Form
import joyfill.editors.document.helper.update
import joyfill.rememberDocumentEditor
import kiota.File
import kiota.FileManager
import kiota.file.mime.Image

@Composable
internal fun HintHandlerSample(files: FileManager) {
    val editor = rememberDocumentEditor(json = JSONUtils.hintAndDeficiencyDemo())

    Form(
        editor = editor,
        onUpload = {
            when (val result = files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                is File -> listOf(files.toBase64Url(result))
                else -> listOf(randomImageUrl())
            }
        },
        onFieldChange = { event ->
            // Filter out unwanted events
            if (event is ComponentEvent.CellEvent && event.source?.component?.title == "Device Type") {

                // Alarms table, field to be updated
                val table = editor.fields.table("Alarm Devices")!!
                val row = table.rows.find(event.rowId.orEmpty())!!

                // Columns to be updated
                val visualHintColumn = table.columns.block("Visual Inspection Hint")!!
                val functionalHintColumn = table.columns.block("Functional Test Hint")!!

                // Selected option from dropdown
                val selectedOption = row.dropdown("Device Type")!!.state.value.data

                // Hints table, referenced fields
                val hintsTable = editor.fields.table("Hints")!!

                // Find hint row for selected device type
                val hintRow = hintsTable.rows.all().find { row ->
                    row.dropdown("Device Type")?.state?.value?.data?.id == selectedOption?.id
                }

                // Get data from hint row
                val visualInspectionHint = hintRow?.block("Visual Inspection Hint")?.state?.value?.data
                val functionalTestHint = hintRow?.block("Functional Test Hint")?.state?.value?.data


                editor.update(
                    // Table to update
                    fieldId = table.id,
                    // Row Id to update
                    rowId = event.rowId,
                    // Columns to update with data from hint row
                    cellUpdates = mapOf(
                        visualHintColumn to visualInspectionHint,
                        functionalHintColumn to functionalTestHint
                    ),
                )
            }
        }
    )
}