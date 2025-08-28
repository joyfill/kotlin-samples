package io.joyfill.sample

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemedSample(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable BoxScope.() -> Unit,
) {
    MaterialTheme(colorScheme = if (isDark) darkColorScheme() else lightColorScheme()) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Box(
                content = content,
                modifier = Modifier.systemBarsPadding().padding(horizontal = 12.dp)
            )
        }
    }
}