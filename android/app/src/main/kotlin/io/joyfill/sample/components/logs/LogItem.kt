package io.joyfill.sample.components.logs

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
internal fun LogItem(
    index: Int,
    log: String,
    modifier: Modifier = Modifier,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }
    var loadedBatches by rememberSaveable { mutableIntStateOf(1) }
    var processedLines by remember { mutableStateOf<List<String>?>(null) }
    var isProcessing by remember { mutableStateOf(false) }
    val isLongText = remember(log) { LogTextProcessor.isLongText(log) }

    val (formattedText, formattedPreview) = remember(log) {
        val formatted = LogTextProcessor.formatJsonText(log)
        val preview = LogTextProcessor.createPreview(formatted)
        formatted to preview
    }
    
    LaunchedEffect(formattedText, expanded) {
        if (expanded && processedLines == null) {
            isProcessing = true
            withContext(Dispatchers.Default) {
                LogTextProcessor.processLinesForDisplay(formattedText)
            }.let { result ->
                processedLines = result
                isProcessing = false
            }
        }
    }
    
    val (visibleLines, hasMoreLines) = remember(processedLines, loadedBatches) {
        processedLines?.let { lines ->
            LogTextProcessor.getVisibleLines(lines, loadedBatches)
        } ?: (emptyList<String>() to false)
    }
    
    // Reset when collapsed
    LaunchedEffect(expanded) {
        if (!expanded) {
            loadedBatches = 1
            processedLines = null
            isProcessing = false
        }
    }

    Box(
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {
            Row {
                Text(
                    text = "#$index",
                    style = MaterialTheme.typography.labelSmall,
                )
                
                if (isLongText) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "(${log.length} chars)",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .clickable {
                        expanded = !expanded
//                        clipboardManager.setText(AnnotatedString(log))
                    }
                    .fillMaxWidth()
                    .heightIn(min = 50.dp, max = if (expanded) 300.dp else 120.dp)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
                        shape = MaterialTheme.shapes.small
                    )
            ) {
                if (!expanded) {
                    Text(
                        text = formattedPreview,
                        maxLines = 6,
                        overflow = TextOverflow.Ellipsis,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 8.dp)
                    )
                } else {
                    if (isProcessing) {
                        // Show loading state
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Processing large log...",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                            )
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            contentPadding = PaddingValues(vertical = 4.dp)
                        ) {
                            items(visibleLines) { line ->
                                Text(
                                    text = line,
                                    style = MaterialTheme.typography.bodyMedium,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                            
                            if (hasMoreLines) {
                                item {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(top = 8.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = "Showing ${visibleLines.size} of ${processedLines?.size ?: 0} lines",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                                            modifier = Modifier.padding(bottom = 8.dp)
                                        )
                                        
                                        TextButton(
                                            onClick = { 
                                                loadedBatches++
                                            },
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Text("Load More (${LogTextProcessor.LINES_PER_BATCH} lines)")
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}