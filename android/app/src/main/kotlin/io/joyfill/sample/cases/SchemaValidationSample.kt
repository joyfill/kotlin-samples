package io.joyfill.sample.cases

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        PageActionsContainer(
            files = files,
            initialJson = "",
            enableSchemaValidation = true,
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