package io.joyfill.sample.cases

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.components.PageActionsContainer
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import kiota.File
import kiota.FileManager
import kiota.file.mime.Image
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
@Composable
internal fun SchemaValidationSample(files: FileManager) {
    var jsonSchema by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Schema Validation (optional)",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = jsonSchema,
            maxLines = 3,
            onValueChange = { jsonSchema = it },
            modifier = Modifier.fillMaxWidth().heightIn(max = 200.dp),
            placeholder = { Text("JSON Schema will be auto-filled with default...") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        PageActionsContainer(
            files = files,
            initialJson = "",
            enableSchemaValidation = true,
            customSchema = jsonSchema,
            content = { editor, mode ->
                Form(
                    editor = editor,
                    mode = mode,
                    modifier = Modifier.fillMaxWidth(),
                    onUpload = {
                        when (val result =
                            files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                            is File -> listOf(files.toBase64Url(result))
                            else -> listOf(randomImageUrl())
                        }
                    }
                )
            },
        )
    }
}