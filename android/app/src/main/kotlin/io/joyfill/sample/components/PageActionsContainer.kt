package io.joyfill.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.joyfill.sample.utils.toSafeJsonString
import joyfill2.Mode
import joyfill2.editors.document.DocumentEditor
import joyfill2.events.ChangeLog
import joyfill2.rememberDocumentEditor
import joyfill2.tools.validation.Valid
import kiota.Failure
import kiota.File
import kiota.FileManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
internal fun PageActionsContainer(
    files: FileManager,
    initialJson: String,
    modifier: Modifier = Modifier,
    templates: List<TemplateItem> = emptyList(),
    enableSchemaValidation: Boolean = false,
    additionalOnChange: (changelog: List<ChangeLog>) -> Unit = {},
    content: @Composable (editor: DocumentEditor, mode: Mode) -> Unit,
) {
    var mode by remember { mutableStateOf(Mode.fill) }
    var enableSchemaValidation by remember { mutableStateOf(enableSchemaValidation) }
    var currentJson by remember { mutableStateOf(initialJson) }
    val changeLogs = remember { mutableStateListOf<String>() }
    val errorLogs = remember { mutableStateListOf<String>() }
    var isValid by remember { mutableStateOf(false) }
    val clipboardManager = LocalClipboardManager.current
    val scope = rememberCoroutineScope { Dispatchers.Default }

    val editor = if (currentJson.isNotBlank()) {
        rememberDocumentEditor(
            json = currentJson,
            validateSchema = enableSchemaValidation,
            onError = {
                errorLogs.add(it.err)
            },
            onChange = {
                it.changelogs.forEach { changelog ->
                    changeLogs.add(changelog.toSafeJsonString())
                }
                additionalOnChange(it.changelogs)
            },
        )
    } else null

    LaunchedEffect(changeLogs.size, editor) {
        editor?.let {
            val validationResult = it.validate()
            isValid = validationResult is Valid
        } ?: run {
            isValid = false
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
    ) {
        PageActions(
            mode = mode,
            changeLogs = changeLogs,
            errorLogs = errorLogs,
            clearLogs = { changeLogs.clear() },
            clearErrorLogs = { errorLogs.clear() },
            fileManager = files,
            templates = templates,
            isValid = isValid,
            onJsonChange = { json ->
                changeLogs.clear()
                errorLogs.clear()
                currentJson = json
            },
            shareJson = {
                if (editor == null) return@PageActions
                scope.launch {
                    when (val file = files.create(editor.toJsonString(), "joyfill.json")) {
                        is Failure<*> -> {}
                        is File -> files.share(file)
                    }
                }
            },
            enableSchemaValidation = enableSchemaValidation,
            onSchemaValidationSwitch = { enableSchemaValidation = it },
            onModeChange = { mode = it },
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            HorizontalDivider(modifier = Modifier.weight(1F))
            Spacer(Modifier.width(8.dp))
            Text(
                text = "BUILD: 2708 (02)",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.SemiBold,
            )
        }

        if (editor != null) {
            content(editor, mode)
        } else {
            Text(
                text = "Select a JSON template from above or upload a JSON file to see the form with schema validation",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
    }
}