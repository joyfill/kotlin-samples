package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.utils.randomImageUrl
import joyfill2.Form
import joyfill2.Mode
import joyfill2.buildDocument
import joyfill2.rememberDocumentEditor

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
            date(
                title = "Date of Birth",
                id = "dob",
                format = "YYYY-MM-DD",
                value = 1748811355000L,
            )
            text(title = "Year", formula = "concat('Your year of birth is:', sub(year(timestamp()),year(dob)))")
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