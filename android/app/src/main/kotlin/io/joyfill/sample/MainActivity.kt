package io.joyfill.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import io.joyfill.sample.ui.DocumentService
import joyfill.Form
import joyfill.rememberEditor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleApp()
        }
    }
}

@Composable
fun SampleApp() {
    val service = DocumentService()
    val document = service.getEmployeeDocument()
    val editor = rememberEditor(document)
    Form(editor = editor)
}