package com.example.showcaseapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.showcaseapplication.ui.theme.ShowcaseApplicationTheme

// TODO: Stwórz nową aktywność, która będzie odbierać implicit intent zdefiniowany poniżej w funkcji shareData
// Zmodyfikuj w odpowiedni sposób AndroidManifest
// Dodaj logikę, która będzie odpowiadać za odczytanie danych z intentu
// Wypisz za pomocą Toasta otrzymany tekst
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowcaseApplicationTheme {
                DataSharingButton()
            }
        }
    }
}

@Composable
fun DataSharingButton() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            shareData(context)
        }, modifier = Modifier.align(Alignment.Center)) {
            Text(
                text = "Click me to send the data!",
            )
        }
    }
}

private fun shareData(context: Context) {
    val shareIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "Check out this awesome data from my app!")
        type = "text/plain"
    }
    context.startActivity(Intent.createChooser(shareIntent, "Share text via"))
}