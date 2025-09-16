package io.joyfill.sample.samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.utils.JSONUtils
import joyfill.Form
import joyfill.Mode
import joyfill.editors.document.DocumentEditor
import joyfill.editors.document.helper.change
import joyfill.events.ChangeEvent
import joyfill.rememberDocumentEditor
import kiota.FileManager
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalEncodingApi::class)
@Composable
internal fun ChangeHandlerSample(files: FileManager) {
    val uploader = remember(files) { Uploader(files) }
    var editor1: DocumentEditor? = null
    var editor2: DocumentEditor? = null

    val changeHandler1: DocumentEditor.(ChangeEvent) -> Unit = {
        editor2?.change(it.changelogs)
    }

    val changeHandler2: DocumentEditor.(ChangeEvent) -> Unit = {
        editor1?.change(it.changelogs)
    }

    editor1 = rememberDocumentEditor(
        json = JSONUtils.joshSortAndFilter(),
        onChange = changeHandler1
    )

    editor2 = rememberDocumentEditor(
        json = JSONUtils.joshSortAndFilter(),
        onChange = changeHandler2
    )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Form(
            editor = editor1,
            mode = Mode.fill,
            navigation = null,
            modifier = Modifier.weight(1F),
            onUpload = uploader::handler,
        )
        Form(
            editor = editor2,
            mode = Mode.fill,
            navigation = null,
            modifier = Modifier.weight(1F),
            onUpload = uploader::handler,
        )
    }
}