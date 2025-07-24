package io.joyfill.sample.cases

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.components.PageActionsContainer
import io.joyfill.sample.utils.JSONUtils
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.editors.document.helper.change
import kiota.File
import kiota.FileManager
import kiota.file.mime.Image
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
@Composable
internal fun ChangeHandlerSample(files: FileManager) {
    var editor1: joyfill2.editors.document.DocumentEditor? by remember { mutableStateOf(null) }
    var editor2: joyfill2.editors.document.DocumentEditor? by remember { mutableStateOf(null) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // First Editor with its own PageActionsContainer
        PageActionsContainer(
            files = files,
            initialJson = JSONUtils.joshSortAndFilter(),
            modifier = Modifier.weight(1f),
            additionalOnChange = { changeLogs1 ->
                editor2?.change(changeLogs1)
            },
            content = { editor, mode ->
                editor1 = editor // Store reference to the first editor

                Form(
                    editor = editor,
                    mode = mode,
                    navigation = null,
                    modifier = Modifier.fillMaxWidth(),
                    onUpload = {
                        when (val result =
                            files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                            is File -> listOf(files.toBase64Url(result))
                            else -> listOf(randomImageUrl())
                        }
                    },
                )
            }
        )

        // Second Editor with its own PageActionsContainer
        PageActionsContainer(
            files = files,
            initialJson = JSONUtils.joshSortAndFilter(),
            modifier = Modifier.weight(1f),
            additionalOnChange = { changelogs2 ->
                editor1?.change(changelogs2)
            },
            content = { editor, mode ->
                editor2 = editor // Store reference to the second editor

                Form(
                    editor = editor,
                    mode = mode,
                    navigation = null,
                    modifier = Modifier.fillMaxWidth(),
                    onUpload = {
                        when (val result =
                            files.picker(listOf(Image.PNG, Image.JPEG, Image.JPG)).open()) {
                            is File -> listOf(files.toBase64Url(result))
                            else -> listOf(randomImageUrl())
                        }
                    },
                )
            }
        )
    }
}