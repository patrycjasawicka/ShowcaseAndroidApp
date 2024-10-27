package com.example.showcaseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.showcaseapplication.ui.theme.ShowcaseApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowcaseApplicationTheme {
                StateHolder()
            }
        }
    }
}

@Composable
fun StateHolder() {
    var counter by remember { mutableStateOf(0) }

    GreetingScreen(counter = counter, onIncrement = { counter++ })
}

@Composable
fun GreetingScreen(counter: Int, onIncrement: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello, Welcome to Jetpack Compose!", color = Color.Black)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Button clicked: $counter times", color = Color.Black)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onIncrement() }) {
            Text(text = "Click Me")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            imageVector = Icons.Default.Face,
            contentDescription = "Sample Image",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecompositionDemoScreen() {
    StateHolder()
}