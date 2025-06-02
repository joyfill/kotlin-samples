//package io.joyfill.sample.cases
//
//import androidx.compose.runtime.Composable
//import io.joyfill.sample.ThemedSample
//import joyfill.Form
//import joyfill.Mode
//import joyfill.buildDocument
//import joyfill.builder.number
//import joyfill.builder.text
//import joyfill.builder.textarea
//
//@Composable
//internal fun MobileViewSample() = ThemedSample {
//    val document = buildDocument {
//        val name = text("Full name")
//        val age = number("Age")
//        val bio = textarea("Biography")
//        mobile(age, name, bio)
//    }
//
//    Form(
//        editor = rememberEditor(document),
//        mode = Mode.fill,
//        navigation = false,
//        pageId = document.files.first().pages.first().id,
//        onChange = {
//            it.document
//        },
//    )
//}