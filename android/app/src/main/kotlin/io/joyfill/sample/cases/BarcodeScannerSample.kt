package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill2.Form
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor


@Composable
internal fun BarcodeScannerSample() = ThemedSample {

    val barcodes = listOf("123456", "https://joyfil.io", "DSM, TZ", "+255711000002")

    val document = buildDocument {
        page("Name and Salary")
        text(title = "First Name")
        text(title = "Last Name")
        number(title = "Daily Salary (USD)")
        barcode("Barcode")
    }

    println(document.toJsonString()) // Print the JSON representation of the document

    Form(
        editor = rememberDocumentEditor(document),
//        onCapture = {
//            delay(2000)
//            barcodes.random()
//        }
    )
}