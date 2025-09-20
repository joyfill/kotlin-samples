package io.joyfill.sample.samples

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill.ComponentEvent
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.editors.document.DocumentEditor
import joyfill.editors.document.helper.tableEditor
import joyfill.rememberDocumentEditor
import kiota.File
import kiota.FileManager
import kiota.MB
import kiota.file.mime.Image
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.collections.component1
import kotlin.collections.component2

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

internal fun DocumentEditor.replace(
    fieldId: String,
    rowId: String?,
    columnId: String?,
    schemaId: String? = null,
    parentPath: String? = null,
    urls: Map<String, String>
) {
    if (urls.isEmpty() || rowId == null) return
    val field =  if (schemaId == null) fields.table(fieldId) ?: return else fields.collection(fieldId) ?: return
    val tableEditor = field.tableEditor(rowId, schemaId, parentPath) ?: return
    val row = tableEditor.rows.find(rowId)
    val cell = row?.image(columnId) ?: return
    val attachments = cell.state.value.data.toMutableList()
    for ((old, new) in urls) {
        val idx = attachments.indexOfFirst { it.url == old }.takeIf { it >= 0 } ?: continue
        val attachment = attachments[idx]
        attachments[idx] = attachment.copy(url = new)
    }
    cell.set(attachments)
}

internal fun DocumentEditor.replace(
    fieldId: String,
    oldUrl: String,
    newUrl: String,
    rowId: String?,
    columnId: String?,
    schemaId: String? = null,
    parentPath: String? = null,
) = replace(fieldId, rowId, columnId, schemaId,  parentPath,mapOf(oldUrl to newUrl))

private val cached by lazy { mutableMapOf<String, String>() }

@OptIn(ExperimentalEncodingApi::class)
internal suspend fun FileManager.toBase64Url(file: File): String {
    val info = info(file)
    val key = "${info.name()}-${info.size()}"
    return cached.getOrPut(key) {
        "data:${info.mime().text};base64,${Base64.encode(readBytes(file))}"
    }
}

@Composable
internal fun ImageSample(files: FileManager) = ThemedSample {
    val document = remember {
        buildDocument {
            image(
                title = "Profile Picture",
                multi = true,
                value = "https://picsum.photos/1024/1024",
            )

            table("Users") {
                image("photo", multi = true)
            }

            collection {
                table("Users", root = true) {
                    image("photo", multi = true)
                }
            }
        }
    }

    val editor = rememberDocumentEditor(document)
    val scope = rememberCoroutineScope()

    Form(
        editor = editor,
        mode = Mode.fill,
        license = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3N1ZXIiOiJKb3lmaWxsIExMQyIsImlzc3VlZCI6IlNlcnZpY2UgVHJhZGUiLCJjb2xsZWN0aW9uRmllbGQiOnRydWV9.EA_6ZEq9viV6omtSquXzHkGMMIOtqyR2utE6sq2swATFn7-GCR032WZyxkJhc7dSl9rBG0sSNdQhfLYafKpJ07LD2jK7izKXcl0lZ4OkYWUjBlJzZqQVS9VIfkJxZg_CshuyTI5Srzw0-V8AuuaC_Lu2oAEiRxwMqCWXuZl6uHloe2sO5XmMUcZnkoOlwmNwsKwgjmL2N_9-FuuMha15jcqsEcgoA4y2caGIGsXdJlvEaQKT81nn4fN79eYGHVv_EucFutZLLLDbtZLheIYaV9gIGUrFyX210AGZ56sp6tGuadHu9yqQGM_a6kK_d5A97tnMlOzg06-CvWXzEaibMduxX1fecg8_iu6mUgA_1HN8E5FjtBtDUa6qpcIVMlGFss2rWiu1NdDBnZPhu6ZDPy9-h3edVFrGF-qCAaEk_Kvg2H4qnRhdZOzvS1JA1ZgxTKTH9UeQff5QJ8k4h83rG5_aPHuAEwj1KD9nK_h9Qlk3ClIUO_vaRxYl-SyyOffCUBBbnwCdyV4oKE4giJAxBbsup_pKYGZFKgpeBx_s3hOFvrHjShd-pFqgBJJUGf8Niz2yge4y7U0efuG9XAYKeIqAm5KF9x7_oDMmXYswF554QOb49V8SCaOmjTs3hU2zf0TzWv4WTOLW78Ahd4q3-pJVG8535r1oOH8Z7YiI6-4",
        onUpload = { event ->
            val currentSource = event.source
            val local = when (val file =
                files.picker(listOf(Image.PNG, Image.JPG, Image.JPEG), limit = 50.MB).open()) {
                is File -> files.toBase64Url(file)
                else -> return@Form emptyList()
            }
            scope.launch {
                delay(5000)
                val remote = randomImageUrl()
                if (currentSource == null) return@launch
                if (event is ComponentEvent.FieldEvent) {
                    editor.replace(
                        fieldId = currentSource.component.id,
                        oldUrl = local,
                        newUrl = remote
                    )
                } else if (event is ComponentEvent.CellEvent) {
                    editor.replace(
                        fieldId = event.fieldId,
                        oldUrl = local,
                        newUrl = remote,
                        rowId = event.rowIds?.firstOrNull(),
                        columnId = event.columnId,
                        schemaId = event.schemaId,
                        parentPath = event.parentPath
                    )
                }
            }
            listOf(local)
        }
    )
}