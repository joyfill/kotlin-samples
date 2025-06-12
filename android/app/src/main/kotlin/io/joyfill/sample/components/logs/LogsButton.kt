package io.joyfill.sample.components.logs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChangeCircle
import androidx.compose.material3.Icon
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
    expand: () -> Unit
) {
    OutlinedButton(
        onClick = expand,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(Icons.Default.ChangeCircle, contentDescription = null)
            Text("Logs")
            if (logCount > 0){
                Text(
                    text = logCount.toString(),
                    modifier = Modifier.testTag("$LOG-$COUNT")
                )
            }
        }
    }
}
