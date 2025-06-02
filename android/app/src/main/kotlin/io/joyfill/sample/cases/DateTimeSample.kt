package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberEditor

@Composable
internal fun DateTimeSample() = ThemedSample {
    val document = buildDocument {
        date(
            title = "D.O.B",
            value = 1704153600000,
//            value = 0,
            format = "DD-MM-YYYY hh:mm"
//            format = "DD-MM-YYYY"
        )
    }

    Form(
        editor = rememberEditor(document),
        mode = Mode.fill,
        navigation = true,
    )
}