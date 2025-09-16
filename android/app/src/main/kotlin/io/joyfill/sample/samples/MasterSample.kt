package io.joyfill.sample.samples

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.joyfill.sample.Platform
import io.joyfill.sample.ThemedSample
import kiota.FileManager

@Composable
internal fun MasterSample(files: FileManager, platform: Platform) {
    val isSystemDark = isSystemInDarkTheme()
    var isDark by rememberSaveable { mutableStateOf(isSystemDark) }
    ThemedSample(isDark = isDark) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            var currentSample by remember { mutableStateOf<SampleType?>(null) }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (currentSample != null) {
                    IconButton(onClick = { currentSample = null }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                    Text(
                        text = currentSample?.title.orEmpty(),
                        style = MaterialTheme.typography.titleMedium,
                        maxLines = 1,
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                    Switch(
                        checked = isDark,
                        onCheckedChange = { isDark = it },
                        thumbContent = {
                            Icon(
                                modifier = Modifier.padding(4.dp),
                                imageVector = if (isDark) Icons.Default.DarkMode else Icons.Outlined.LightMode,
                                contentDescription = if (isDark) "Dark Mode" else "Light Mode"
                            )
                        }
                    )
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                HorizontalDivider(modifier = Modifier.weight(1F))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "BUILD: 09/13/2025 (01)",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            when (currentSample) {
                SampleType.DYNAMIC_SAMPLE -> DynamicJSONSample(files, platform)
                SampleType.FORMULA_TEMPLATES -> FormulaTemplatesSample(files, platform)
                SampleType.CHANGE_HANDLER_2_DOCUMENT -> ChangeHandlerSample(files)
                SampleType.CHANGE_HANDLER_SERVICE_TRADE -> HintHandlerSample(files)
                null -> SampleGrid { sampleType -> currentSample = sampleType }
            }
        }
    }
}

@Composable
private fun SampleGrid(onSampleSelected: (SampleType) -> Unit) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(SampleType.entries) { sampleType ->
            SampleCard(
                title = sampleType.title,
                description = sampleType.description,
                onClick = { onSampleSelected(sampleType) }
            )
        }
    }
}

@Composable
private fun SampleCard(title: String, description: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

private enum class SampleType(val title: String, val description: String) {
    DYNAMIC_SAMPLE(
        "DYNAMIC Sample",
        "Convert JSON to interactive forms with optional schema validation."
    ),
    CHANGE_HANDLER_2_DOCUMENT(
        "Change Handler (2-Document)",
        "Synchronize changes between two document instances."
    ),
    CHANGE_HANDLER_SERVICE_TRADE(
        "Change Handler (Service Trade Ex.)",
        "Auto-populate hints based on device selection."
    ),
    FORMULA_TEMPLATES(
        "Formula Templates",
        "All of the formula templates in one place, with a working resolver."
    )
}