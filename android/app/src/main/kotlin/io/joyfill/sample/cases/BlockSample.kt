//package io.joyfill.sample.cases
//
//import androidx.compose.runtime.Composable
//import io.joyfill.sample.ThemedSample
//import joyfill.Form
//import joyfill.Mode
//import joyfill.builder.block
//import joyfill.buildDocument
//
//@Composable
//internal fun BlockSample() = ThemedSample {
//    val document = buildDocument {
//        block(
//            value = "This is a block field",
//            fontColor = "#FF0000",
//            fontWeight = "bold",
//            textAlign = "center",
//            textOverflow = "elipsis",
//            textTransform = "uppercase"
//        )
//    }
//
//    Form(
//        editor = rememberEditor(document),
//        navigation = true,
//    )
//}