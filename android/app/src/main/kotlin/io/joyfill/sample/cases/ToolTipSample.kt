package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.ToolTip
import joyfill.buildDocument
import joyfill.rememberEditor
import kotlin.random.Random

@Composable
internal fun ToolTipSample() = ThemedSample {
    val document = remember {
        buildDocument {
            text(title = "Full Name", tip = ToolTip(title = "name", description = "Enter full name here", visible = true))
            textarea(title = "Bio", tip = ToolTip(title = "bio", description = "Enter full biography here", visible = false))
            select("Name", options = listOf("John", "James", "Jade"), tip = ToolTip(title = "name", description = "Select name here", visible = true), multi = false)
            date(title = "D.o.B", tip = ToolTip(title = "dob", description = "Enter date of birth here", visible = true))
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