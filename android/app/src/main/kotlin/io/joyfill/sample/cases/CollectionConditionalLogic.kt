package io.joyfill.sample.cases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

@Composable
internal fun CollectionConditionalLogic() {

    val document = buildDocument {
        collection("Employees", id = "employeesCollection") {
            table(
                title = "Departments",
                id = "departmentsTable",
                root = true,
                required = true,
                children = listOf("paymentsTable")
            ) {
                text("Department Name", id = "departmentNameText", required = true)
            }
            table(
                title = "Payments",
                id = "paymentsTable",
                hidden = true,
                logic = {
                    showWhenAll { cell(table = "departmentsTable", column = "departmentNameText").isFilled() }
                }
            ) {
                text("Name", id = "paymentsNameText", required = true)
                number("Age", id = "paymentsAgeNumber")
            }
        }
    }

    val editor = rememberDocumentEditor(document, false)

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