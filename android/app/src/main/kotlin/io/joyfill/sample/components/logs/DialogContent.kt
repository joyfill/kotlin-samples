package io.joyfill.sample.components.logs

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun DialogContent(
    modifier: Modifier = Modifier,
    logType: LogType,
    logs: List<String>,
) {
    val localColor = LocalContentColor.current
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.padding(horizontal = 10.dp)
    ) {
        itemsIndexed(logs) { index, changeLog ->
            LogItem(
                index = index + 1,
                logType = logType,
                log = changeLog,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = localColor.copy(alpha = 0.4f),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(12.dp)
                    .animateContentSize()
            )
        }
    }
}
