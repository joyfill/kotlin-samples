package io.joyfill.sample.cases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

@Composable
internal fun CollectionConditionalLogic() {

    val document = buildDocument {
        collection("Collection ConditionalLogicTest", id = "collection") {
            table(
                title = "Main table",
                id = "mainTable",
                root = true,
                children = listOf("Show when text is empty", "Show when text is filled")
            ) {
                text("text", id = "textColumn")
            }
            table("Show when text is empty", id = "emptyTable", hidden = true, logic = {
                showWhenAll { cell(table = "mainTable", column = "textColumn").isEmpty() }
            }) {
                text(id = "numberColumn")
                text(id = "signatureColumn")
            }
            table("Show when text is filled", id = "fillTable", hidden = true, logic = {
                showWhenAll { cell(table = "mainTable", column = "textColumn").isFilled() }
            }) {
                text("textAreaColumn")
            }
        }
    }

    val editor = rememberDocumentEditor(document)

    Form(
        editor = editor,
        showUnsupportedFields = true,
        showUnsupportedColumns = true,
        showRowNumbers = false,
        modifier = Modifier.fillMaxWidth(),
        mode = Mode.fill,
        onUpload = {
            listOf(randomImageUrl())
        },
    )
}