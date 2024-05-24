package io.joyfill.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThemedSample(
    isDark: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    var isLight by rememberSaveable { mutableStateOf(!isDark) }
    MaterialTheme(colorScheme = if (isLight) lightColorScheme() else darkColorScheme()) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.padding(12.dp)) {
                Box(modifier = Modifier.padding(top = 28.dp)) {
                    content()
                }
                Switch(
                    modifier = Modifier.align(Alignment.TopEnd),
                    checked = isLight,
                    onCheckedChange = { isLight = !isLight }
                )
            }
        }
    }
}