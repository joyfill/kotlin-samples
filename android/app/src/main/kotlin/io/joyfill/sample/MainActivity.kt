package io.joyfill.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.joyfill.sample.ui.FileUploadSample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemedSample {
//                BasicSample()
                FileUploadSample()
            }
        }
    }
}
