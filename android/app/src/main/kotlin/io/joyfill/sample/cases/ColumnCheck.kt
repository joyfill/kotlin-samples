package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

@Composable
internal fun ColumnCheck() = ThemedSample {
    val document = remember {
        buildDocument {
            table("Table") {
                text("Name")
            }
            collection {
                table("Main") {
                    text("Name")
                }
            }
        }
    }

    Form(
        editor = rememberDocumentEditor(document) { (changelogs, document) ->
            changelogs.forEach {
                println(it.change::class.simpleName)
                println(it.change)
            }
        },
        mode = Mode.fill,
    )
}