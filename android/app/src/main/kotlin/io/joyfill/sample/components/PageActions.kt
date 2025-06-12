package io.joyfill.sample.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import joyfill2.Mode
import io.joyfill.sample.components.logs.ChangeLogDialogContent
import io.joyfill.sample.components.logs.LogsButton
import joyfill2.utils.BUTTON
import joyfill2.utils.EDIT
import joyfill2.utils.INVALID
import joyfill2.utils.LOG
import joyfill2.utils.UPLOAD
import joyfill2.utils.VALID
import kiota.Cancelled
import kiota.Denied
import kiota.Failure
import kiota.FileManager
import kiota.Files
import kiota.MB
import kiota.file.PickerLimit
import kotlinx.coroutines.launch

@Composable
internal fun PageActions(
    mode: Mode = Mode.fill,
    changeLogs: List<String> = emptyList(),
    clearLogs: () -> Unit = {},
    fileManager: FileManager? = null,
    isValid: Boolean = false,
    onJsonChange: (String) -> Unit = {},
    onModeChange: (Mode) -> Unit = {},
) {
    val coroutineScope = rememberCoroutineScope()
    var showJsonDialog by remember { mutableStateOf(false) }
    var showAlertDialog by remember { mutableStateOf(false) }
    var showLogsDialog by remember { mutableStateOf(false) }

    if (showJsonDialog) {
        JsonCollectorDialog(
            onApply = {
                if (it.isNotBlank()) {
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
    }

    if (showAlertDialog) {
        AlertDialog(
            onDismissRequest = { showAlertDialog = false },
            confirmButton = {
                Button(onClick = { showAlertDialog = false }) {
                    Text("OK")
                }
            },
            title = { Text("Invalid JSON") },
            text = { Text("The provided JSON is not valid. Please correct it and try again.") }
        )
    }

    if (showLogsDialog) {
        Dialog(
            onDismissRequest = {
                showLogsDialog = false
            },
            properties = DialogProperties(
                usePlatformDefaultWidth = false
            )
        ) {
            ChangeLogDialogContent(
                modifier = Modifier.fillMaxSize(0.95f),
                changeLogs = changeLogs,
                clearLogs = clearLogs,
                collapse = {
                    showLogsDialog = false
                },
            )
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Fill Mode: ")
        Switch(
            checked = mode == Mode.fill,
            onCheckedChange = { onModeChange(mode) }
        )

        LogsButton(
            logCount = changeLogs.size,
            expand = {
                showLogsDialog = true
            },
            modifier = Modifier.testTag("$LOG-$BUTTON")
        )

        //icon  that toggles the dialog not button
        Icon(
            imageVector = Icons.Default.Edit,
            contentDescription = "Edit JSON",
            modifier = Modifier
                .testTag("$EDIT-$BUTTON")
                .clickable { showJsonDialog = true }
        )

        Icon(
            imageVector = Icons.Default.Upload,
            contentDescription = "Upload JSON file",
            modifier = Modifier
                .testTag("$UPLOAD-$BUTTON")
                .clickable {
                    coroutineScope.launch {
                        when (val result =
                            fileManager?.picker(limit = PickerLimit(size = 100.MB, count = 1))?.open()) {
                            Cancelled -> {}
                            Denied -> println("Permission denied")
                            is Failure<*> -> print(result)
                            is Files -> {
                                onJsonChange(fileManager.readText(result.first()))
                            }

                            null -> println("Null body")
                        }
                    }
                }
        )

        if (isValid) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Valid",
                tint = Color.Green,
                modifier = Modifier.testTag("$VALID-$BUTTON")
            )
        } else {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "inValid",
                tint = Color.Red,
                modifier = Modifier.testTag("$INVALID-$BUTTON")
            )
        }
    }
}