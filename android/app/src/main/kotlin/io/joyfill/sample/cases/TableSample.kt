package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.ToolTip
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor
import joyfill2.utils.Option
import kotlinx.coroutines.delay
import kotlinx.datetime.Clock.System
import kotlin.random.Random

@Composable
internal fun TableSample() = ThemedSample {
    val hobbies = mapOf<String, String?>(
        "Coding" to null,
        "Gaming" to "#b794f6",
        "Cooking" to "#B71C1C",
        "Traveling" to "#80CBC4",
        "Photos" to null,
        "Music" to null
    )

    val document = remember {
        buildDocument {
            table("Employees Employees Employees Employees Employees Employees Employees Employees Employees Employees Employees Employees Employees ", required = true, tip = ToolTip("Hello i am a title", "and i am description")) {
//                progress("Completed")
                date("Date", value = 1704153600000, format = "DD-MM-YYYY hh:mm")
                text("First Name", required = true, hidden = false)
                text("Last Name", hidden = false, required = true)
                block("Very long long long Nickname", value = "N/A")
                select("Hobbies", options = hobbies.keys.toList(), required = true, multi = false)
                barcode("Barcode", required = true)
                date("DOB", format = "MM/DD/YYYY hh:mm a", required = true)
                number("Salary (USD)", value = 550.55)
                signature("Signature")
                dropdown("Department", options = listOf("IT", "HR", "UI/UX", "QA"), required = true)
//                unknown("Sales")
                image("picture")
            }
        }
    }

    val editor = rememberDocumentEditor(document)

    val names = listOf("Takahashi", "Tanya", "", "Raiden", "", "", "", "Kazuya")
    val barcodes = listOf("123456", "https://joyfil.io", "DSM, TZ", "+255711000002")
    val nicks = listOf("TK Executing tasks Executing tasks", "Executing tasks:", "Executing tasks SN", "Executing tasks RD", "Executing tasks: [:samples-desktop:jvmRun] in project", "Executing tasksExecuting tasksExecuting tasks", "KZ", "Executing tasks: [:samples-desktop:jvmRun] in project Executing tasks: [:samples-desktop:jvmRun] in project")
    val salaries = listOf<Double>(100.0, 350.50, 500.0, 250.0, 400.55, 240.99, 150.0, 200.0)
    val now = System.now().epochSeconds

    LaunchedEffect(Unit) {
        val table = editor.fields.table("Employees")
        repeat(3) {
            val row = table?.rows?.append()
            row?.text("First Name")?.value(names.random())
            row?.text("Last Name")?.value(names.random())
            row?.date("DOB")?.value(now + Random.nextLong(0, 1000000))
            row?.block("Nickname")?.value(nicks.random())
            row?.number("Salary (USD)")?.value(salaries.random())
            val optionList = hobbies.keys.shuffled().take(Random.nextInt(1, 3)).map {
                Option(it, it)
            }
            row?.multiSelect("Hobbies")?.set(optionList)
        }
    }

    Form(
        editor = editor,
        mode = Mode.fill,
        showUnsupportedColumns = false,
        onUpload = {
            listOf(randomImageUrl())
        },
        onCapture = {
            delay(2000)
            barcodes.random()
        }
    )
}