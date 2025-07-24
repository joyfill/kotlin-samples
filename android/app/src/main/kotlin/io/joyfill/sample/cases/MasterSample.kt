package io.joyfill.sample.cases

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.joyfill.sample.ThemedSample
import kiota.FileManager

@Composable
internal fun MasterSample(files: FileManager) = ThemedSample {
    Column {
        var currentSample by remember { mutableStateOf<SampleType?>(null) }

        if (currentSample != null) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { currentSample = null }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
                Text(
                    text = currentSample?.title.orEmpty(),
                    style = MaterialTheme.typography.headlineSmall
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }

        when (currentSample) {
            SampleType.DYNAMIC_SAMPLE -> DynamicJSONSample(files)
            SampleType.FORMULA_TEMPLATES -> FormulaTemplatesSample(files)
            SampleType.SCHEMA_VALIDATION -> SchemaValidationSample(files)
            SampleType.CHANGE_HANDLER_2_DOCUMENT -> ChangeHandlerSample(files)
            SampleType.CHANGE_HANDLER_SERVICE_TRADE -> ServiceTradeExSample(files)
            null -> SampleGrid { sampleType -> currentSample = sampleType }
        }
    }
}

@Composable
private fun SampleGrid(onSampleSelected: (SampleType) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Joyfill Sample Gallery",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
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
    SCHEMA_VALIDATION(
        "Schema Validation",
        "Validate JSON against a schema with real-time feedback."
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