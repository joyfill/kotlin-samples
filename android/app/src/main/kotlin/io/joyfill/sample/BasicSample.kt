package io.joyfill.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.ui.service
import joyfill.Form
import joyfill.rememberEditor

@Composable
fun BasicSample() {
    // Fetch your document and remember so that it survives recomposition
    val document = remember { service.getEmployeeDocument() }

    // Give it to a Document Editor
    val editor = rememberEditor(document)

    // Render the form with the editor
    Column(modifier = Modifier.padding(8.dp)) {
        Form(editor = editor)
        OutlinedButton(
            onClick = {
                // get the updated document
                val updated = editor.toDocument()

                // push it to the server
                service.save(editor.toDocument())
            }
        ) {
            Text("Save Document")
        }
    }
}