package io.joyfill.sample.samples

import joyfill.ComponentEvent
import joyfill.editors.file.AbstractFileEditor
import kiota.File
import kiota.FileManager
import kiota.Files
import kiota.GB
import kiota.file.PickerLimit
import kiota.file.mime.Image

internal class Uploader(private val files: FileManager) {

    private val mimes = listOf(Image.PNG, Image.JPEG, Image.JPG)

    suspend fun handler(event: ComponentEvent<AbstractFileEditor>): List<String> {
        val picker = if (event.source?.component?.multi == true) {
            files.picker(mimes, limit = PickerLimit(size = 2.GB, count = Int.MAX_VALUE))
        } else {
            files.picker(mimes, limit = 2.GB)
        }
        return when (val result = picker.open()) {
            is File -> listOf(files.toBase64Url(result))
            is Files -> result.files.map { files.toBase64Url(it) }
            else -> emptyList()
        }
    }
}