package io.joyfill.sample.ui

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


@Composable
fun FileUploadSample() {
    val coroutineScope = rememberCoroutineScope()
    val channel = Channel<List<String>>()

    val multiplePhotoPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenMultipleDocuments(),
        onResult = { uris ->
            coroutineScope.launch {
                val urls = uploadService(uris)
                channel.send(urls)
            }
        }
    )

    val document = buildDocument {
        image(title = "Profile Picture", value = "https://picsum.photos/1024/1024")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Form(
            editor = rememberDocumentEditor(document),
            mode = Mode.fill,
            onUpload = {
                multiplePhotoPickerLauncher.launch(arrayOf("*/*"))
                channel.receive()
            }
        )
    }
}

suspend fun uploadService(urls: List<Uri>): List<String> {
    delay(2000)
    return urls.map {
        val w = Random.nextInt(1, 4)
        val h = Random.nextInt(1, 4)
        "https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}"
    }
}