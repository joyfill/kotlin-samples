package io.joyfill.sample.components.logs

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun ChangeLogDialogContent(
    modifier: Modifier = Modifier,
    changeLogs: List<String>,
    clearLogs: () -> Unit,
    collapse: () -> Unit,
) {
    Surface(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .animateContentSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "ChangeLogs (${changeLogs.size})")

                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    if (changeLogs.isNotEmpty()) {
                        TextButton(clearLogs) {
                            Text("Clear All")
                        }
                    }
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "Close Model",
                        modifier = Modifier.clickable { collapse() }
                    )
                }
            }

            DialogContent(
                modifier = Modifier.fillMaxSize(),
                changeLogs = changeLogs
            )
        }
    }
}