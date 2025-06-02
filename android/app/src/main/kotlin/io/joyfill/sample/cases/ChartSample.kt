package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.fields.chart.Axis
import joyfill.rememberEditor
import kotlin.random.Random

@Composable
internal fun ChartSample() = ThemedSample {
    val document = buildDocument {
        text("Full name")
        chart(
            title = "Characteristic gainer",
            x = Axis("Current Characteristics", min = 00.0, max = 5000.0),
            y = Axis("Voltage", min = 30.0, max = 40.0),
        ) {
            line("Resistor") { point ->
                point(1000, 10, "A")
                point(2000, 40, "B")
                point(3000, 10, "C")
                point(4000, 30, "D")
                point(5000, 20, "E")
            }
            line("Capacitor") { point ->
                point(1000, 20, "A")
                point(2000, 10, "B")
                point(3000, 30, "C")
                point(4000, 15, "D")
            }

            line("Capasaba") { point ->
                point(1000, 20, "A")
                point(2000, 40, "B")
                point(3000, 30, "C")
                point(4000, 35, "D")
                point(5000, 40, "B")
            }
        }
    }

    val editor = rememberEditor(document) { (changelogs, _) ->
        changelogs.forEach {
            println(it.change::class.simpleName)
            println(it.change)
        }
    }

    Form(editor = editor, mode = Mode.fill, navigation = true, onUpload = {
        val w = 1 + Random.nextInt(4)
        val h = 1 + Random.nextInt(4)
        listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
    })
}