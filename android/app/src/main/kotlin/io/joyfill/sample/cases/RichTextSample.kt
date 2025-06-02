//package io.joyfill.sample.cases
//
//import androidx.compose.runtime.Composable
//import io.joyfill.sample.ThemedSample
//import joyfill.Document
//import joyfill.Form
//import joyfill.Mode
//import joyfill.serializers.JoyfillSerializersModule
//import kotlinx.serialization.json.Json
//import kotlinx.serialization.modules.plus
//import kotlin.random.Random
//
//@Composable
//internal fun RichTextSample() = ThemedSample {
//    val document = buildDocument {
//        richText(value = "{\"blocks\":[{\"key\":\"blq6l\",\"text\":\"NFPA 99 Risk Assessment Electrical Equipment/Gas Equipment\\n\\nAnd the members of the lost Ark\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[{\"offset\":0,\"length\":60,\"style\":\"BOLD\"},{\"offset\":0,\"length\":60,\"style\":\"fontsize-24\"},{\"offset\":60,\"length\":31,\"style\":\"fontsize-16\"}],\"entityRanges\":[],\"data\":{\"text-align\":\"left\"}}],\"entityMap\":{}}")
//    }
//
//    Form(editor = rememberEditor(document))
//}