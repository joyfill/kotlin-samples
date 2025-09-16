package io.joyfill.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material.icons.filled.VpnKey
import androidx.compose.material.icons.outlined.Error
import androidx.compose.material.icons.outlined.RemoveModerator
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.joyfill.sample.Platform
import io.joyfill.sample.components.logs.LogDialogContent
import io.joyfill.sample.components.logs.LogType
import io.joyfill.sample.utils.JSONUtils
import joyfill.Mode
import joyfill.toDocument
import joyfill.utils.BUTTON
import joyfill.utils.COUNT
import joyfill.utils.EDIT
import joyfill.utils.INVALID
import joyfill.utils.LOG
import joyfill.utils.UPLOAD
import joyfill.utils.VALID
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
    shareJson: () -> Unit = {},
    copyJson: () -> Unit = {},
    onModeChange: (Mode) -> Unit = {},
    license: String? = null,
    onLicenseChange: (String?) -> Unit = {},
    platform: Platform = Platform.Android,
) {
    val coroutineScope = rememberCoroutineScope()
    var showJsonDialog by remember { mutableStateOf(false) }
    var showAlertDialog by remember { mutableStateOf(false) }
    var showLogsDialog by remember { mutableStateOf(false) }
    var showErrorDialog by remember { mutableStateOf(false) }
    var showLicenseDialog by remember { mutableStateOf(false) }
    var selectedTemplate by remember { mutableStateOf<TemplateItem?>(null) }

    val templateItems = remember(templates) {
        templates.ifEmpty {
            listOf(
                TemplateItem("Empty Date", content = EmptyDateDocument.toJsonString()),
                TemplateItem("May 2", content = JSONUtils.may2v1JSON()),
                TemplateItem("ST Performance", content = JSONUtils.performanceST()),
                TemplateItem("Josh Sort and Filter", content = JSONUtils.joshSortAndFilter()),
                TemplateItem("Conditional Collection", content = JSONUtils.conditionalCollection()),
                TemplateItem("Block JSON", content = JSONUtils.blockJSON()),
                TemplateItem("Every Field Type Demo", content = JSONUtils.everyFieldTypeDemoJSON()),
                TemplateItem(
                    "Page Conditional Logic",
                    content = JSONUtils.pageConditionalLogicJSON()
                ),
                TemplateItem(
                    "Field Conditional Logic",
                    content = JSONUtils.allFieldConditionalLogicJSON()
                ),
                TemplateItem(
                    "Collection Validation",
                    content = JSONUtils.collectionValidationJSON()
                ),
                TemplateItem(
                    "Collection Conditional Logic",
                    content = JSONUtils.collectionConditionalLogicJSON()
                ),
                TemplateItem("All field may12", content = JSONUtils.allFieldMay12()),
                TemplateItem("Error Handling sample", content = JSONUtils.errorHandlingSample()),
                TemplateItem(
                    "All field visible and hidden",
                    content = JSONUtils.hiddenAndVisibleFieldsJSON()
                ),
                TemplateItem("3000 Fields", content = JSONUtils.threeThousandFieldsJSON()),
                TemplateItem("Table Field", content = JSONUtils.table2K()),
                TemplateItem(
                    "Table Collection 1K Rows",
                    content = JSONUtils.tableCollectionPopulated1K()
                ),
                TemplateItem(
                    "-DO NOT USE- Table Collection 10K Rows",
                    content = JSONUtils.tableCollectionPopulated10K()
                ),
            )
        }
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
    ) {
        if (enableDocumentSelection) TemplateDropdown(
            items = templateItems,
            selectedItem = selectedTemplate,
            onItemSelected = { item ->
                selectedTemplate = item
                onJsonChange(item.content)
            },
            compact = false,
            modifier = Modifier.weight(1F),
        )

        IconButton(onClick = shareJson) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Share Json",
            )
        }
        if (platform == Platform.Desktop) {
            Spacer(Modifier.width(4.dp))
            IconButton(onClick = copyJson) {
                Icon(
                    imageVector = Icons.Default.ContentCopy,
                    contentDescription = "Copy Json",
                )
            }
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
    ) {
        SingleChoiceSegmentedButtonRow(
            modifier = Modifier
                .testTag("MODE-$BUTTON")
                .weight(1f)
        ) {
            SegmentedButton(
                selected = mode == Mode.fill,
                onClick = { onModeChange(Mode.fill) },
                shape = SegmentedButtonDefaults.itemShape(index = 0, count = 2),
                label = { Text("Fill") },
                modifier = Modifier.testTag("FILL-$BUTTON")
            )
            SegmentedButton(
                selected = mode == Mode.readonly,
                onClick = { onModeChange(Mode.readonly) },
                shape = SegmentedButtonDefaults.itemShape(index = 1, count = 2),
                label = { Text("Read-Only") },
                modifier = Modifier.testTag("READONLY-$BUTTON"),
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextButton(
                onClick = { showLogsDialog = true },
                modifier = Modifier.testTag("$LOG-$BUTTON"),
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.List,
                    contentDescription = "Changelogs",
                )
                Spacer(Modifier.width(2.dp))
                Text(
                    text = changeLogs.size.toString(),
                    modifier = Modifier.testTag("$LOG-$COUNT")
                )
            }

            TextButton(
                onClick = { showErrorDialog = true },
                modifier = Modifier.testTag("ERROR-$LOG-$BUTTON"),
            ) {
                Icon(
                    imageVector = Icons.Outlined.Error,
                    contentDescription = "Error logs",
                )
                Spacer(Modifier.width(2.dp))
                Text(text = errorLogs.size.toString())
            }
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        FilledIconToggleButton(
            checked = enableSchemaValidation,
            onCheckedChange = { onSchemaValidationSwitch(it) },
            modifier = Modifier.testTag("SCHEMA-$BUTTON"),
            colors = IconButtonDefaults.filledIconToggleButtonColors(
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                checkedContainerColor = MaterialTheme.colorScheme.primary,
                checkedContentColor = MaterialTheme.colorScheme.onPrimary,
            )
        ) {
            if (enableSchemaValidation) {
                Icon(
                    imageVector = Icons.Default.Shield,
                    contentDescription = "Validated",
                )
            } else {
                Icon(
                    imageVector = Icons.Outlined.RemoveModerator,
                    contentDescription = "Not validated",
                )
            }
        }

        IconButton(
            onClick = { showJsonDialog = true },
            modifier = Modifier.testTag("$EDIT-$BUTTON")
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit JSON",
            )
        }

        IconButton(
            onClick = {
                val files = fileManager ?: return@IconButton
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
                            } catch (_: Throwable) {
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
            },
            modifier = Modifier.testTag("$UPLOAD-$BUTTON")
        ) {
            Icon(
                imageVector = Icons.Default.Upload,
                contentDescription = "Upload JSON file",
            )
        }

        IconButton(
            onClick = { showLicenseDialog = true },
            modifier = Modifier.testTag("LICENSE-$BUTTON")
        ) {
            Icon(
                imageVector = Icons.Default.VpnKey,
                contentDescription = "License Settings",
                tint = if (license.isNullOrBlank()) Color.Gray else MaterialTheme.colorScheme.primary
            )
        }

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
                contentDescription = "invalid",
                tint = Color.Red,
                modifier = Modifier
                    .size(20.dp)
                    .testTag("$INVALID-$BUTTON")
            )
        }
    }

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
        shape = MaterialTheme.shapes.large,
        title = { Text("Invalid JoyDoc") },
        text = { Text("The provided JSON is not valid JoyDoc. Please correct it and try again.") }
    )

    if (showLogsDialog) Dialog(
        onDismissRequest = {
            showLogsDialog = false
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        ),
    ) {
        LogDialogContent(
            logs = changeLogs,
            clearLogs = clearLogs,
            logType = LogType.CHANGE_LOG,
            collapse = {
                showLogsDialog = false
            },
            modifier = Modifier
                .fillMaxSize(0.95f)
                .clip(MaterialTheme.shapes.large)
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
            logs = errorLogs,
            clearLogs = clearErrorLogs,
            logType = LogType.ERROR_LOG,
            collapse = {
                showErrorDialog = false
            },
            modifier = Modifier
                .fillMaxSize(0.95f)
                .clip(MaterialTheme.shapes.large)
        )
    }

    if (showLicenseDialog) LicenseInputDialog(
        currentLicense = license ?: "",
        onLicenseChange = onLicenseChange,
        onDismiss = { showLicenseDialog = false }
    )
}