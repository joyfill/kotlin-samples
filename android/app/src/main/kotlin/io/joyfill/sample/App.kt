package io.joyfill.sample

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import io.joyfill.sample.cases.MasterSample
import joyfill.Page
import joyfill2.Document
import joyfill2.Form
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor
import joyfill2.toDocument
import kiota.FileManager
import kotlinx.coroutines.delay
import kotlinx.serialization.json.buildJsonObject
import kotlin.time.Duration.Companion.microseconds

@Composable
fun App(files: FileManager) {
//    ComprehensiveSample()
//    ImageSample(files)
//    SignatureSample()
//    TableSample()
//    TextSample()
//    DateTimeSample()
//    NavigationSample()
//    MobileViewSample()
//    MultiSelectSample()
//    ChartSample()
//    BlockSample()
//    RichTextSample()
//    DemoSample()
//    UptickSample()
//    ConditionalLogicSample()
//    CollectionConditionalLogic()
//    ToolTipSample()
//    BarcodeScannerSample()
//    MarketingSample()
//    ShowAndTell()
//    ImageReplaceSample()
//    CollectionFieldSample()
//    ChangeHandlerSample(files)
//    HintHandlerSample(files)
//    DynamicJSONSample(files)
      MasterSample(files)
//    CollectionBulkInputPerf(files)
//    FormulaSample()
}