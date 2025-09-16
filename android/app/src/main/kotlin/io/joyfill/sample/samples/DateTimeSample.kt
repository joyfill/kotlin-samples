package io.joyfill.sample.samples

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberDocumentEditor

@Composable
internal fun DateTimeSample() = ThemedSample {
    val document = buildDocument {
        date(
            title = "D.O.B",
            format = "hh:mma"
//            format = "DD-MM-YYYY"
        )
    }

    Form(
        editor = rememberDocumentEditor(document),
        mode = Mode.fill,
    )
}