package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberEditor
import kotlin.random.Random

/**
 * Make the navigation look as the one jeremy shared on slack
 */
@Composable
internal fun NavigationSample() = ThemedSample {
    val document = remember {
        buildDocument {
            page("Personal Info")
            text("First name")
            text("Last name")
            date("d.o.b")
            page("Academic Info")
            dropdown("Education Level", options = listOf("Bachelors", "Masters", "PhD"))
            text("Course")
            number("G.P.A")
        }
    }

    val pages = document.files.flatMap { it.pages }
    var page by remember { mutableStateOf(pages.first()) }

//    Column {
//        Text("Jump to")
//        Row {
//            pages.forEach {
//                OutlinedButton(onClick = {
//                    page = it
//                }) {
//                    Text(it.name, Modifier.background(if (page == it) MaterialTheme.colorScheme.surface.copy(alpha = 0.7f) else Color.Transparent))
//                }
//            }
//        }
//    }

    val editor = rememberEditor(document) { (changelogs, document) ->
        changelogs.forEach {
            println(it.change::class.simpleName)
            println(it.change)
        }
    }

    Form(
//        modifier = Modifier.padding(top = 100.dp),
        editor = editor,
        mode = Mode.fill,
        pageId = page.id,
        navigation = true,
        onUpload = {
            val w = 1 + Random.nextInt(4)
            val h = 1 + Random.nextInt(4)
            listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
        }
    )
}