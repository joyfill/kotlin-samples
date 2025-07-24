package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.components.PageActionsContainer
import io.joyfill.sample.utils.JSONUtils
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.ComponentEvent
import joyfill2.Form
import joyfill2.editors.document.helper.update
import joyfill2.table.Column
import joyfill2.utils.Option
import kiota.File
import kiota.FileManager
import kiota.file.mime.Image
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * Constants for table and field names used in the service trade sample
 */
private object ServiceTradeConstants {
    const val HINTS_TABLE_NAME = "Hints"
    const val ALARM_DEVICES_TABLE_NAME = "Alarm Devices"
    const val DEVICE_TYPE_FIELD = "Device Type"
    const val VISUAL_INSPECTION_HINT_FIELD = "Visual Inspection Hint"
    const val FUNCTIONAL_TEST_HINT_FIELD = "Functional Test Hint"
}

/**
 * A sample demonstrating automatic hint population based on device type selection.
 * When a user selects a device type in the "Alarm Devices" table, the corresponding
 * hint values are automatically populated from the hidden "Hints" table.
 */
@OptIn(ExperimentalEncodingApi::class)
@Composable
internal fun ServiceTradeExSample(files: FileManager) {
    PageActionsContainer(
        files = files,
        initialJson = JSONUtils.hintAndDeficiencyDemo(),
        content = { editor, mode ->
            val hintManager = HintManager(editor)
            
            Form(
                editor = editor,
                mode = mode,
                onUpload = {
                    when (val result =
                        files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                        is File -> listOf(files.toBase64Url(result))
                        else -> listOf(randomImageUrl())
                    }
                },
                onFieldChange = { event -> handleFieldChange(event, hintManager) }
            )
        },
    )
}

/**
 * Manages hint population logic for device types
 */
private class HintManager(private val editor: joyfill2.editors.document.DocumentEditor) {
    
    /**
     * Handles device type change and triggers hint population
     */
    fun handleDeviceTypeChange(rowId: String) {
        val table = editor.fields.table(ServiceTradeConstants.ALARM_DEVICES_TABLE_NAME) ?: return
        val row = table.rows.find(rowId) ?: return
        val selectedOption = row.dropdown(ServiceTradeConstants.DEVICE_TYPE_FIELD)?.state?.value?.data ?: return
        
        populateHints(selectedOption, rowId)
    }
    
    /**
     * Populates hints for a selected device type in the alarm devices table
     */
    private fun populateHints(selectedDeviceTypeId: Option, rowId: String) {
        val hintsTable = editor.fields.table(ServiceTradeConstants.HINTS_TABLE_NAME) ?: return
        val alarmDevicesTable = editor.fields.table(ServiceTradeConstants.ALARM_DEVICES_TABLE_NAME) ?: return
        
        val hintRow = findHintRowForDeviceType(hintsTable, selectedDeviceTypeId) ?: return
        val cellUpdates = createCellUpdates(hintRow, alarmDevicesTable)
        
        if (cellUpdates.isNotEmpty()) {
            editor.update(
                fieldId = alarmDevicesTable.id,
                cellUpdates = cellUpdates,
                rowId = rowId
            )
        }
    }
    
    /**
     * Finds the hint row that matches the selected device type
     */
    private fun findHintRowForDeviceType(hintsTable: joyfill2.editors.table.TableEditor, selectedDeviceTypeId: Option) =
        hintsTable.rows.all().find { row ->
            row.dropdown(ServiceTradeConstants.DEVICE_TYPE_FIELD)?.state?.value?.data?.id == selectedDeviceTypeId.id
        }
    
    /**
     * Creates cell updates for hint fields
     */
    private fun createCellUpdates(hintRow:  joyfill2.editors.table.RowManager, alarmDevicesTable: joyfill2.editors.table.TableEditor): Map<Column, Any?> {
        val visualInspectionHint = hintRow.block(ServiceTradeConstants.VISUAL_INSPECTION_HINT_FIELD)?.state?.value?.data
        val functionalTestHint = hintRow.block(ServiceTradeConstants.FUNCTIONAL_TEST_HINT_FIELD)?.state?.value?.data
        
        val visualHintColumn = alarmDevicesTable.columns.block(ServiceTradeConstants.VISUAL_INSPECTION_HINT_FIELD)
        val functionalHintColumn = alarmDevicesTable.columns.block(ServiceTradeConstants.FUNCTIONAL_TEST_HINT_FIELD)
        
        return buildMap {
            visualHintColumn?.let { column ->
                visualInspectionHint?.let { hint ->
                    put(column, hint)
                }
            }
            functionalHintColumn?.let { column ->
                functionalTestHint?.let { hint ->
                    put(column, hint)
                }
            }
        }
    }
}


/**
 * Handles field change events, specifically for device type selection
 */
private fun handleFieldChange(event: ComponentEvent<*>, hintManager: HintManager) {
    if (event !is ComponentEvent.CellEvent) return
    if (event.source?.component?.title != ServiceTradeConstants.DEVICE_TYPE_FIELD) return
    
    hintManager.handleDeviceTypeChange(event.rowId)
}