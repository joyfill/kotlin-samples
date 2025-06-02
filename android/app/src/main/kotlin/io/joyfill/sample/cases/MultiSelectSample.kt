package io.joyfill.sample.cases

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import io.joyfill.sample.ThemedSample
import joyfill.Form
import joyfill.Mode
import joyfill.buildDocument
import joyfill.rememberEditor

@Composable
internal fun MultiSelectSample() = ThemedSample {
    val document = remember {
        buildDocument {
            dropdown(
                title = "Superhero",
                options = listOf("Batman", "Superman", "Spiderman", "Ironman"),
                value = "Superman"
            )
            select(
                title = "Superheroes",
                options = listOf("Batman", "Superman", "Spiderman", "Ironman"),
                value = listOf("Batman", "Superman")
            )

            select(
                title = "Superhero",
                multi = false,
                options = listOf("Batman", "Superman", "Spiderman", "Ironman"),
                value = listOf("Batman", "Superman")
            )
        }
    }

    Form(
        editor = rememberEditor(document),
        mode = Mode.fill,
        navigation = true
    )
}