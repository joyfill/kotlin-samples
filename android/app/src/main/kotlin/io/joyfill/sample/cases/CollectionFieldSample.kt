package io.joyfill.sample.cases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor
import kotlin.random.Random

@Composable
internal fun CollectionFieldSample() = ThemedSample {
    val cities = listOf("New York", "Los Angeles", "Chicago", "Houston", "Phoenix")
    val document = remember {
        buildDocument {
            page("Page 1")
            collection("School Data") {
                table("Schools", id = "school", children = listOf("Teachers"), required = true) {
                    text(title = "First Name", required = true)
                    text(title = "Last Name", required = true)
                    dropdown(title = "Location", options = cities, required = true)
                    image("image")
                    select(
                        title = "Superheroes",
                        options = listOf("Batman", "Superman", "Spiderman", "Ironman"),
                        value = listOf("Batman", "Superman"),
                    )
                    barcode("Barcode")
                }
                table("Teachers", id = "teachers", children = listOf("Students"), required = true) {
                    text("Name")
                    number("Age")
                }
                table("Students", id = "students", children = listOf("Parent")) {
                    text("Parent", required = true)
                    number("Age")
                }
                table("Parent", id = "parent") {
                    text("Name")
                    number("Age")
                }
            }
        }
    }

    val editor = rememberDocumentEditor(document)

    LaunchedEffect(Unit) {
        val names = listOf("John", "Jame", "Jamie", "Roger", "Kuku", "Raiden", "Proper", "Sad", "Jin", "")

        val N = 5

        repeat(N) {
            val collection = editor.fields.collection("School Data")
            val table = collection?.root()
            val row = table?.rows?.append()
            val first = names.random()
            val last = (names - first).random()
            row?.text("First Name")?.value(first)
            row?.text("Last Name")?.value(last)
            row?.text("Location")?.value(cities.random())
            row?.text("Address")?.value("$first's Avenue")

            val teachers = row?.tables?.find("Teachers")
            repeat(Random.nextInt(N) + 1) {
                val r = teachers?.rows?.append()
                r?.text("Name")?.value(names.random())
                repeat(Random.nextInt(N) + 1) {
                    r?.tables?.find("Students")?.rows?.append()?.text("Parent")
                        ?.value("${names.random()}${names.random()}")
                }
            }
        }
    }

    Form(
        editor = editor,
        showUnsupportedFields = true,
        showUnsupportedColumns = true,
        showRowNumbers = true,
        modifier = Modifier.fillMaxWidth(),
        mode = Mode.fill,
        onUpload = {
            listOf(randomImageUrl())
        },
    )
}
