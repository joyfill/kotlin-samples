package io.joyfill.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.DialogProperties

@Composable
fun JsonCollectorDialog(
    onApply: (String) -> Unit,
    onCancel: () -> Unit,
    onDismissRequest: () -> Unit // For handling outside clicks or back button
) {
    var text by remember { mutableStateOf("") }

    AlertDialog(
        properties = DialogProperties(usePlatformDefaultWidth = false),
        onDismissRequest = onDismissRequest,
        title = { Text("Enter Joyfill  JSON") },
        text = {
            Column {
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("JSON Input") },
                    modifier = Modifier.fillMaxSize(),
                )
            }
        },
        confirmButton = {
            Button(onClick = { onApply(text); onDismissRequest() }) {
                Text("Apply")
            }
        },
        dismissButton = {
            Button(onClick = onCancel) {
                Text("Cancel")
            }
        }
    )
}