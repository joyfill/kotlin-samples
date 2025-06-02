package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberEditor
import kotlin.random.Random

private val options = listOf("IT", "HR", "UI/UX", "QA")

@Composable
internal fun ShowAndTell() = ThemedSample {
    val document = remember {
        buildDocument {
            text("Company Name")
            unknown("Duration")
            table("Employees") {
                text("Name", required = true)
                number("Salary")
                dropdown("Department", options = options, required = true)
                unknown("Sales")
                image("picture")
            }
        }
    }

    val editor = rememberEditor(document)

    val names = listOf("Takahashi", "Tanya", "Sonya", "Raiden", "Page", "Jin", "Kazama", "Kazuya")
    val salaries = listOf<Double>(100.0, 350.50, 500.0, 250.0, 400.55, 240.99, 150.0, 200.0)
    LaunchedEffect(Unit) {
        val table = editor.fields.table("Employees")
        repeat(5) {
            val row = table?.rows?.append()
            if (Random.nextInt(10) > 5) {
                row?.text("Name")?.set(names.random())
            }
            row?.number("Salary")?.set(salaries.random())
            if (Random.nextInt(10) > 5) {
                row?.dropdown("Department")?.select(options.random())
            }
        }
    }

    Form(
//        editor = rememberEditor(group),
        editor = editor,
        mode = Mode.fill,
        showUnsupportedColumns = true,
        showUnsupportedFields = false,
        navigation = true,
        onUpload = {
            val w = 1 + Random.nextInt(4)
            val h = 1 + Random.nextInt(4)
            listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
        }
    )
}