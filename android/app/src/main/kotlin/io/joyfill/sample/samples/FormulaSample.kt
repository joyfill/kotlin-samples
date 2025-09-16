package io.joyfill.sample.samples

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberDocumentEditor

@Composable
internal fun FormulaSample() = ThemedSample {
    val document = remember {
        buildDocument {
            //-----------------------------------------
            // Students  report  testing IF, and SUM
            //-----------------------------------------
//            number ("Major Science - 1, Commerce - 2", id = "major", value = 1.0)
//            number("Mathematics", id = "math", value = 100.0)
//            number("Physics", id = "phy", value = 100.0)
//            number("Book-keeping", id = "bk", value = 40.0)
//            number("Average", formula = "if({major} == 1, sum({math}, {phy}), sum({math}, {bk}))", value = 0.0, id = "sumMarks")
//            text ("General comment", formula = "if({sumMarks} >= 150, \"Excellent\", \"Alright\")", value = "", readonly = true)
            //-----------------------------------------
            // Voting  ability testing  IF and AND
//            //-----------------------------------------
//            number("Year of birth", id = "yob", value = 2007.0)
//            number("Nationality(1 - American, 2 - Tanzanian)", id = "nationality", value = 1.0)
//            text("American Voting Status",  formula = "if(and({yob} <= 2007, {nationality} == 1), \"Eligible\", \"Not Eligible\")", value = "", readonly = true)
            //-----------------------------------------
            // Work title and age: testing  IF and EMPTY
            //-----------------------------------------
//            text("Work Title", id = "title")
//            number("Age", id = "age")
//            text(
//                title = "Description",
//                formula = "if(empty(title), 'Please Enter your title', concat('Hi, your age is: ',age, ' Title is: ',title))"
//            )
//            date(
//                title = "Date of Birth",
//                id = "dob",
//                format = "YYYY-MM-DD",
//                value = 1748811355000L,
//            )
//            text(title = "Year", formula = "concat('Your year of birth is:', sub(year(timestamp()),year(dob)))")

            number(title = "Math", id = "math", value = 0.0)
            number(title = "Physics 1", id = "phy1", value = 0.0)
            number(title = "Physics 2", id = "phy2", value = 0.0)
            number(title = "Physics", id = "phy", formula = "sum(phy1, phy2)")
            number(title = "Total Marks", id = "total", formula = "sum(math, phy)", value = 0.0)
        }
    }

    Form(
        editor = rememberDocumentEditor(
            document = document,
            functions = {
//                include(your_function)
            },
        ),
        mode = Mode.fill,
        onUpload = {
           listOf(randomImageUrl())
        }
    )
}