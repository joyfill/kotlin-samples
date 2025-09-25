package io.joyfill.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.samples.initialLicense

@Composable
internal fun LicenseInputDialog(
    currentLicense: String,
    onLicenseChange: (String?) -> Unit,
    onDismiss: () -> Unit,
) {
    var licenseText by remember { mutableStateOf(currentLicense) }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("License Configuration") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(
                    text = "Configure the license key for testing different licensing features:",
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "• Collection fields require a valid license with collectionField=true",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Text(
                    text = "• Invalid licenses will disable premium features",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                TextField(
                    value = licenseText,
                    onValueChange = { licenseText = it },
                    label = { Text("License Key") },
                    placeholder = { Text("Enter license key or leave empty for no license") },
                    minLines = 3,
                    maxLines = 6,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = "License will be validated internally by the Form component",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        },
        confirmButton = {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                TextButton(onClick = {
                    licenseText = initialLicense
                }) {
                    Text("Use Default Valid License")
                }
                TextButton(onClick = {
                    onLicenseChange(licenseText.takeIf { it.isNotBlank() })
                    onDismiss()
                }) {
                    Text("Apply")
                }
            }
        },
        dismissButton = {
            TextButton(onClick = {
                onLicenseChange(null)
                onDismiss()
            }) {
                Text("Clear & Close")
            }
        }
    )
}