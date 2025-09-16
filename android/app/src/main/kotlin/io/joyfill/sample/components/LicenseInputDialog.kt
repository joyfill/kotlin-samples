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

@Composable
internal fun LicenseInputDialog(
    currentLicense: String,
    onLicenseChange: (String?) -> Unit,
    onDismiss: () -> Unit,
) {
    var licenseText by remember { mutableStateOf(currentLicense) }

    val defaultLicense = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3N1ZXIiOiJKb3lmaWxsIExMQyIsImlzc3VlZCI6IlNlcnZpY2UgVHJhZGUiLCJjb2xsZWN0aW9uRmllbGQiOnRydWV9.EA_6ZEq9viV6omtSquXzHkGMMIOtqyR2utE6sq2swATFn7-GCR032WZyxkJhc7dSl9rBG0sSNdQhfLYafKpJ07LD2jK7izKXcl0lZ4OkYWUjBlJzZqQVS9VIfkJxZg_CshuyTI5Srzw0-V8AuuaC_Lu2oAEiRxwMqCWXuZl6uHloe2sO5XmMUcZnkoOlwmNwsKwgjmL2N_9-FuuMha15jcqsEcgoA4y2caGIGsXdJlvEaQKT81nn4fN79eYGHVv_EucFutZLLLDbtZLheIYaV9gIGUrFyX210AGZ56sp6tGuadHu9yqQGM_a6kK_d5A97tnMlOzg06-CvWXzEaibMduxX1fecg8_iu6mUgA_1HN8E5FjtBtDUa6qpcIVMlGFss2rWiu1NdDBnZPhu6ZDPy9-h3edVFrGF-qCAaEk_Kvg2H4qnRhdZOzvS1JA1ZgxTKTH9UeQff5QJ8k4h83rG5_aPHuAEwj1KD9nK_h9Qlk3ClIUO_vaRxYl-SyyOffCUBBbnwCdyV4oKE4giJAxBbsup_pKYGZFKgpeBx_s3hOFvrHjShd-pFqgBJJUGf8Niz2yge4y7U0efuG9XAYKeIqAm5KF9x7_oDMmXYswF554QOb49V8SCaOmjTs3hU2zf0TzWv4WTOLW78Ahd4q3-pJVG8535r1oOH8Z7YiI6-4"

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
                    licenseText = defaultLicense
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