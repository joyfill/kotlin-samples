package io.joyfill.sample.samples

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberDocumentEditor
import kiota.FileManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
internal fun CollectionBulkInputPerf(files: FileManager) = ThemedSample {
    val document = remember {
        buildDocument {
            page("Page 1")
            collection("School Data") {
                table("Schools", id = "school", children = listOf("Teachers"), root = true) {
                    text(title = "Name", value = "Youssef")
                    text(title = "Location")
                    image("image")
                    select(
                        title = "Superheroes",
                        options = listOf("Batman", "Superman", "Spiderman", "Ironman"),
                        value = listOf("Batman", "Superman"),
                    )
                }
                table("Teachers", id = "teachers", children = listOf("Students")) {
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
        launch(Dispatchers.Default) {
            val names = listOf("John", "", "", "", "", "Raiden", "", "", "Jin", "")
            val cities = listOf("New York", "Los Angeles", "Chicago", "Houston", "Phoenix")

            val N = 5000

            repeat(N) {
                val collection = editor.fields.collection("School Data")
                val table = collection?.root()
                val row = table?.rows?.append()
                val first = names.random()
                val last = (names - first).random()
                row?.text("Name")?.value("$first $last")
                row?.text("Location")?.value(cities.random())
                row?.text("Address")?.value("$first's Avenue")

//            val teachers = row?.tables?.find("Teachers")
//            repeat(Random.nextInt(N) + 1) {
//                val r = teachers?.rows?.append()
//                r?.text("Name")?.value(names.random())
//                repeat(Random.nextInt(N) + 1) {
//                    r?.tables?.find("Students")?.rows?.append()?.text("Parent")
//                        ?.value("${names.random()}${names.random()}")
//                }
//            }
            }
        }
    }

    Form(
        editor = editor,
        showUnsupportedFields = true,
        showUnsupportedColumns = true,
        showRowNumbers = false,
        modifier = Modifier.fillMaxWidth(),
        mode = Mode.fill,
        onUpload = {
            listOf(randomImageUrl())
        },
    )
}
