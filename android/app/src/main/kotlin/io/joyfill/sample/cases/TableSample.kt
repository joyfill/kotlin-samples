package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill2.Form
import joyfill2.Mode
import joyfill2.ToolTip
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor
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
    ).mapNotNull { it.value }

    val document = remember {
        buildDocument {
            text(
                "very very very very very very very very very very very very very very very very very very very long title",
                required = true,
                tip = ToolTip("Hello i am a title", "and i am description")
            )
            table("Employees", required = true, tip = ToolTip("Hello i am a title", "and i am description")) {
//                progress("Completed")
                date("Date", value = 1704153600000, format = "DD-MM-YYYY hh:mm")
                text("First Name", required = true, hidden = false)
                text("Last Name", hidden = false)
                block("Very long long long Nickname", value = "N/A")
                select("Hobbies", options = hobbies, required = true, multi = false)
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

    val names = listOf("Takahashi", "Tanya", "Sonya", "Raiden", "Page", "Jin", "Kazama", "Kazuya")
    val barcodes = listOf("123456", "https://joyfil.io", "DSM, TZ", "+255711000002")
    val nicks = listOf("TK Executing tasks Executing tasks", "Executing tasks:", "Executing tasks SN", "Executing tasks RD", "Executing tasks: [:samples-desktop:jvmRun] in project", "Executing tasksExecuting tasksExecuting tasks", "KZ", "Executing tasks: [:samples-desktop:jvmRun] in project Executing tasks: [:samples-desktop:jvmRun] in project")
    val salaries = listOf<Double>(100.0, 350.50, 500.0, 250.0, 400.55, 240.99, 150.0, 200.0)
    val now = System.now().epochSeconds

//    LaunchedEffect(Unit) {
//        val table = editor.fields.table("Employees")
//        repeat(3) {
//            val row = table?.rows?.append()
//            row?.text("First Name")?.set(names.random())
//            row?.text("Last Name")?.set(names.random())
//            row?.date("DOB")?.set(now + Random.nextLong(0, 1000000))
//            row?.blockText("Nickname")?.set(nicks.random())
//            row?.number("Salary (USD)")?.set(salaries.random())
//            row?.multiSelect("Hobbies")?.selectKeys(hobbies.keys.shuffled().take(Random.nextInt(1,3)))
//        }
//    }

    Form(
        editor = editor,
        mode = Mode.fill,
        showUnsupportedColumns = false,
        onUpload = {
            val w = 1 + Random.nextInt(4)
            val h = 1 + Random.nextInt(4)
            listOf("https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}")
        },
        onCapture = {
            delay(2000)
            barcodes.random()
        }
    )
}