package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.buildDocument
import joyfill.rememberEditor

@Composable
internal fun MarketingSample() = ThemedSample {
    val document = buildDocument {
        page("Marketing Data")
        text("Explorer Name")
        table("School Information") {
            text("Name")
            text("Size")
            text("Levels")
            dropdown("Curriculum", options = listOf("NECTA", "Cambridge", "Oxford"))
            text("Year")
            text("Tuition Fee")
            listOf("Current", "Wishful").forEach {
                text("$it System")
            }
        }

        table("Personal Information") {
            text("Name")
            dropdown("Classification", options = listOf("Teacher", "Parent", "Owner", "Bursar"))
            text("Occupation")
            listOf("Primary", "Secondary", "Wishful").forEach {
                text("$it Device")
            }
            text("Most used feature")
            text("Comments")
        }

//        page("Phone Numbers")
        table("Pool of Phone Numbers") {
            text("Name")
            text("Number")
            dropdown("Status", options = listOf("Pending", "Completed", "Followup", "Unanswered", "Unavailable"))
            text("date")
            text("Comments")
        }
    }

    Form(
        editor = rememberEditor(document)
    )
}