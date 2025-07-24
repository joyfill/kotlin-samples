package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.editors.document.DocumentEditor
import joyfill2.rememberDocumentEditor
import kiota.File
import kiota.FileManager
import kiota.MB
import kiota.file.mime.Image
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

internal fun DocumentEditor.replace(
    fieldId: String,
    urls: Map<String, String> // a map from old URL to new URL
) {
    if (urls.isEmpty()) return
    val field = fields.image(fieldId) ?: return
    val attachments = field.state.value.data.toMutableList()
    for ((old, new) in urls) {
        val idx = attachments.indexOfFirst { it.url == old }.takeIf { it >= 0 } ?: continue
        val attachment = attachments[idx]
        attachments[idx] = attachment.copy(url = new)
    }
    field.set(attachments)
}

internal fun DocumentEditor.replace(
    fieldId: String,
    oldUrl: String,
    newUrl: String
) = replace(fieldId, mapOf(oldUrl to newUrl))


@OptIn(ExperimentalEncodingApi::class)
internal suspend fun FileManager.toBase64Url(file: File): String {
    val info = info(file)
    return "data:${info.mime().text};base64,${Base64.encode(readBytes(file))}"
}

@Composable
internal fun ImageSample(files: FileManager) = ThemedSample {
    val document = remember {
        buildDocument {
            image(
                title = "Profile Picture with a very very very very very very very very very very very very very very very very very very very very very very very very very very very long title",
//                title = "Profile Picture",
                multi = true,
                value = "https://picsum.photos/1024/1024",
            )

            table("Users") {
                image("photo")
            }
        }
    }

    val editor = rememberDocumentEditor(document)
    val scope = rememberCoroutineScope()

    Form(
        editor = editor,
        mode = Mode.fill,
        onUpload = { event ->
            val currentSource = event.source
            val local = when (val file = files.picker(listOf(Image.PNG, Image.JPG, Image.JPEG), limit = 50.MB).open()) {
                is File -> files.toBase64Url(file)
                else -> return@Form emptyList()
            }
            scope.launch {
                delay(5000)
                val remote = randomImageUrl()
                if (currentSource == null) return@launch
                editor.replace(currentSource.component.id, local, remote)
            }
            listOf(local)
        }
    )
}