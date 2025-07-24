package io.joyfill.sample.components.logs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChangeCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import joyfill2.utils.COUNT
import joyfill2.utils.LOG

@Composable
internal fun LogsButton(
    modifier: Modifier = Modifier,
    logCount: Int,
    logType: LogType,
    expand: () -> Unit,
    compact: Boolean = false
) {
    OutlinedButton(
        onClick = expand,
        modifier = modifier,
        contentPadding = if (compact) PaddingValues(4.dp) else PaddingValues(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(if (compact) 2.dp else 4.dp)
        ) {
            Icon(
                Icons.Default.ChangeCircle,
                contentDescription = null,
                modifier = if (compact) Modifier.size(16.dp) else Modifier
            )
            Text(
                logType.title,
                style = if (compact) MaterialTheme.typography.bodySmall else MaterialTheme.typography.bodyMedium
            )
            if (logCount > 0){
                Text(
                    text = logCount.toString(),
                    style = if (compact) MaterialTheme.typography.bodySmall else MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.testTag("$LOG-$COUNT")
                )
            }
        }
    }
}
