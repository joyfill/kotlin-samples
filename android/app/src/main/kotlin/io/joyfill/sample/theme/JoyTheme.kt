package io.joyfill.sample.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
internal fun JoyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = JoyTypography,
        content = content
    )
}