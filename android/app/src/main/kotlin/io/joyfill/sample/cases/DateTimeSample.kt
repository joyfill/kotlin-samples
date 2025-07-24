package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

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