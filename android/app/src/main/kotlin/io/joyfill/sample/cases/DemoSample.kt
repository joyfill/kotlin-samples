package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.buildDocument
import joyfill.rememberEditor

@Composable
internal fun DemoSample() = ThemedSample {
    val document = buildDocument {
        select("hazard", options = listOf("Yes", "No"), multi = false)
        text(title = "explain", hidden = true) {
            showWhenAll {
                field("hazard").isEqualTo("Yes")
            }
        }
    }

    Form(editor = rememberEditor(document))
}