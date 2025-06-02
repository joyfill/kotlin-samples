package io.joyfill.sample.cases

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

@Composable
internal fun ImageReplaceSample() = ThemedSample {
    val document = remember {
        buildDocument {
            image("Replace Me")
        }
    }

    val editor = rememberDocumentEditor(document)

    Column {
        var textField by remember {
            mutableStateOf("")
        }
        Row {
            OutlinedTextField(
                value = textField,
                onValueChange = {
                    textField = it
                },
                modifier = Modifier.weight(1f)
            )
            Button(
                onClick = {
//                    editor.fields.image("Replace Me")?.replace(textField, randomImageUrl())
                }
            ) {
                Text("replace")
            }
        }


        Form(
            editor = editor,
            showUnsupportedFields = true,
            showUnsupportedColumns = true,
            showRowNumbers = false,
            modifier = Modifier.fillMaxWidth(),
            mode = Mode.fill,
            onUpload = {
                val randomUrl = randomImageUrl()
                textField = randomUrl
                listOf(randomUrl)
            },
        )
    }
}