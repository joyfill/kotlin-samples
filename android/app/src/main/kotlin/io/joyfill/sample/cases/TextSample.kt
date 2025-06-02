package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberEditor
import kotlin.random.Random

@Composable
internal fun TextSample() = ThemedSample {
    val document = remember {
        buildDocument {

//            text("Full name", value = "John Doe")
//            textarea("Biography")
//            number("age")
            text(title = "Full Name")
            text(title = "Email")
        }
    }

    Form(
        editor = rememberEditor(document) { (changelogs, document) ->
            changelogs.forEach {
                println(it.change::class.simpleName)
                println(it.change)
            }
        },
        mode = Mode.fill,
        navigation = true,
        onUpload = {
            val w = 1 + Random.nextInt(4)
            val h = 1 + Random.nextInt(4)
            listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
        }
    )
}