package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
//import joyfill.Form
//import joyfill.Mode
//import joyfill.buildDocument
//import joyfill.rememberEditor
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

import kotlin.random.Random

@Composable
internal fun ConditionalLogicSample() = ThemedSample {
    val document = remember {
        buildDocument {
            page("First")
            text(title = "winner", id = "winner")
            number(title = "age", id = "age")
            number(title = "score", hidden = true, id = "score") {
                showWhenAny {
                    field("winner").isEqualTo("Vishnu")
                }
            }
            text(title = "trial", id = "trial")
            page("Second", hidden = true) {
                showWhenAny { field("age").isGreaterThan(18) }
            }
            text(title = "loser", id = "loser")
        }
    }

    Form(
        editor = rememberDocumentEditor(document),
        mode = Mode.fill,
        onUpload = {
            val w = 1 + Random.nextInt(4)
            val h = 1 + Random.nextInt(4)
            listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
        }
    )
}