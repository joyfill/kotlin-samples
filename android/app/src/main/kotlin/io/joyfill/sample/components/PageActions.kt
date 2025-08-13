package io.joyfill.sample.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.joyfill.sample.components.logs.LogDialogContent
import io.joyfill.sample.components.logs.LogType
import io.joyfill.sample.components.logs.LogsButton
import io.joyfill.sample.utils.JSONUtils
import joyfill2.Mode
import joyfill2.toDocument
import joyfill2.utils.BUTTON
import joyfill2.utils.EDIT
import joyfill2.utils.INVALID
import joyfill2.utils.LOG
import joyfill2.utils.UPLOAD
import joyfill2.utils.VALID
import kiota.Cancelled
import kiota.Denied
import kiota.Failure
import kiota.File
import kiota.FileManager
import kiota.MB
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun PageActions(
    mode: Mode = Mode.fill,
    changeLogs: List<String> = emptyList(),
    errorLogs: List<String> = emptyList(),
    clearLogs: () -> Unit = {},
    clearErrorLogs: () -> Unit = {},
    templates: List<TemplateItem> = emptyList(),
    fileManager: FileManager? = null,
    isValid: Boolean = false,
    enableSchemaValidation: Boolean = false,
    onSchemaValidationSwitch: (Boolean) -> Unit = {},
    enableDocumentSelection: Boolean = true,
    onJsonChange: (String) -> Unit = {},
    onModeChange: (Mode) -> Unit = {},
) {
    val coroutineScope = rememberCoroutineScope()
    var showJsonDialog by remember { mutableStateOf(false) }
    var showAlertDialog by remember { mutableStateOf(false) }
    var showLogsDialog by remember { mutableStateOf(false) }
    var showErrorDialog by remember { mutableStateOf(false) }
    var selectedTemplate by remember { mutableStateOf<TemplateItem?>(null) }

    val templateItems = remember(templates) {
        templates.ifEmpty {
            listOf(
                TemplateItem("Empty Date", content = EmptyDateDocument.toJsonString()),
                TemplateItem("May 2", content = JSONUtils.may2v1JSON()),
                TemplateItem("Josh Sort and Filter", content = JSONUtils.joshSortAndFilter()),
                TemplateItem("Block JSON", content = JSONUtils.blockJSON()),
                TemplateItem("Every Field Type Demo", content = JSONUtils.everyFieldTypeDemoJSON()),
                TemplateItem("Page Conditional Logic", content = JSONUtils.pageConditionalLogicJSON()),
                TemplateItem("Field Conditional Logic", content = JSONUtils.allFieldConditionalLogicJSON()),
                TemplateItem("Collection Validation", content = JSONUtils.collectionValidationJSON()),
                TemplateItem("Collection Conditional Logic", content = JSONUtils.collectionConditionalLogicJSON()),
                TemplateItem("All field may12", content = JSONUtils.allFieldMay12()),
                TemplateItem("Error Handling sample", content = JSONUtils.errorHandlingSample()),
                TemplateItem("All field visible and hidden", content = JSONUtils.hiddenAndVisibleFieldsJSON()),
                TemplateItem("3000 Fields", content = JSONUtils.threeThousandFieldsJSON()),
                TemplateItem("Table Field", content = JSONUtils.table2K()),
                TemplateItem("Table Collection 1K Rows", content = JSONUtils.tableCollectionPopulated1K()),
                TemplateItem("-DO NOT USE- Table Collection 10K Rows", content = JSONUtils.tableCollectionPopulated10K()),
            )
        }
    }

    if (enableDocumentSelection) TemplateDropdown(
        items = templateItems,
        selectedItem = selectedTemplate,
        onItemSelected = { item ->
            selectedTemplate = item
            onJsonChange(item.content)
        },
        compact = false
    )


    if (showJsonDialog) JsonCollectorDialog(
        onApply = {
            val document = try {
                it.toDocument()
            } catch (err: Throwable) {
                null
            }
            if (document != null) {
                onJsonChange(it)
                showJsonDialog = false
            } else {
                showAlertDialog = true
            }
        },
        onCancel = {
            showJsonDialog = false
        },
        onDismissRequest = {
            showJsonDialog = false
        }
    )

    if (showAlertDialog) AlertDialog(
        onDismissRequest = { showAlertDialog = false },
        confirmButton = {
            Button(onClick = { showAlertDialog = false }) {
                Text("OK")
            }
        },
        title = { Text("Invalid JoyDoc") },
        text = { Text("The provided JSON is not valid JoyDoc. Please correct it and try again.") }
    )

    if (showLogsDialog) Dialog(
        onDismissRequest = {
            showLogsDialog = false
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        LogDialogContent(
            modifier = Modifier.fillMaxSize(0.95f),
            logs = changeLogs,
            clearLogs = clearLogs,
            logType = LogType.CHANGE_LOG,
            collapse = {
                showLogsDialog = false
            },
        )
    }

    if (showErrorDialog) Dialog(
        onDismissRequest = {
            showErrorDialog = false
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        LogDialogContent(
            modifier = Modifier.fillMaxSize(0.95f),
            logs = errorLogs,
            clearLogs = clearErrorLogs,
            logType = LogType.ERROR_LOG,
            collapse = {
                showErrorDialog = false
            },
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Fill Mode:",
                style = MaterialTheme.typography.bodySmall
            )
            Switch(
                checked = mode == Mode.fill,
                onCheckedChange = { isChecked ->
                    val newMode = if (isChecked) Mode.fill else Mode.readonly
                    onModeChange(newMode)
                }
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            LogsButton(
                logCount = changeLogs.size,
                logType = LogType.CHANGE_LOG,
                expand = { showLogsDialog = true },
                modifier = Modifier.testTag("$LOG-$BUTTON"),
                compact = true
            )

            LogsButton(
                logCount = errorLogs.size,
                logType = LogType.ERROR_LOG,
                expand = { showErrorDialog = true },
                modifier = Modifier.testTag("ERROR-$LOG-$BUTTON"),
                compact = true
            )

            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit JSON",
                modifier = Modifier
                    .size(20.dp)
                    .testTag("$EDIT-$BUTTON")
                    .clickable { showJsonDialog = true }
            )

            Icon(
                imageVector = Icons.Default.Upload,
                contentDescription = "Upload JSON file",
                modifier = Modifier
                    .size(20.dp)
                    .testTag("$UPLOAD-$BUTTON")
                    .clickable {
                        val files = fileManager ?: return@clickable
                        val picker = files.picker(limit = 100.MB)
                        coroutineScope.launch {
                            when (val result = picker.open()) {
                                is Cancelled -> {}
                                is Denied -> println("Permission denied")
                                is Failure<*> -> print(result)
                                is File -> {
                                    val json = files.readText(result)
                                    val document = try {
                                        json.toDocument()
                                    } catch (err: Throwable) {
                                        null
                                    }
                                    if (document != null) {
                                        onJsonChange(json)
                                        showJsonDialog = false
                                    } else {
                                        showAlertDialog = true
                                    }
                                }
                            }
                        }
                    }
            )

            if (isValid) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Valid",
                    tint = Color.Green,
                    modifier = Modifier
                        .size(20.dp)
                        .testTag("$VALID-$BUTTON")
                )
            } else {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "inValid",
                    tint = Color.Red,
                    modifier = Modifier
                        .size(20.dp)
                        .testTag("$INVALID-$BUTTON")
                )
            }
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            "Enable Schema Validation",
            style = MaterialTheme.typography.bodySmall
        )
        Switch(
            checked = enableSchemaValidation,
            onCheckedChange = { onSchemaValidationSwitch(it) }
        )
    }

}