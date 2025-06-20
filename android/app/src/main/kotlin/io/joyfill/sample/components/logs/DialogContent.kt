package io.joyfill.sample.components.logs

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp

@Composable
internal fun DialogContent(
    modifier: Modifier = Modifier,
    changeLogs: List<String>,
) {
    val clipboardManager = LocalClipboardManager.current
    val localColor = LocalContentColor.current
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        itemsIndexed(changeLogs) { index, changeLog ->
            ChangeLogItem(
                index = index + 1,
                changeLog = changeLog,
                modifier = Modifier
                    .clickable {
                        clipboardManager.setText(AnnotatedString(changeLog))
                    }
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
