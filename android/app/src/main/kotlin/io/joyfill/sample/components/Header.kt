package io.joyfill.sample.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun Header(
    title: String,
    onBack: (() -> Unit)? = null,
    onRefresh: (() -> Unit)? = null,
    onSave: (() -> Unit)? = null,
) = Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
    if (onBack != null) Box(modifier = Modifier.weight(0.2f)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable { onBack() }) {
            Icon(Icons.Outlined.ArrowBack, contentDescription = "Go Back", modifier = Modifier.width(30.dp))
            Text("Back")
        }
    }

    Row(modifier = Modifier.weight(0.6f), horizontalArrangement = Arrangement.Center) {
        Text(title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        if (onRefresh != null) Icon(Icons.Outlined.Refresh, "refresh $title", modifier = Modifier.clickable(onClick = onRefresh))
    }
    if (onSave != null) Button(onSave, modifier = Modifier.weight(0.2f), contentPadding = PaddingValues(0.dp), shape = RoundedCornerShape(30)) {
        Text("Save")
    } else if (onBack != null) Box(modifier = Modifier.weight(0.2f))
}