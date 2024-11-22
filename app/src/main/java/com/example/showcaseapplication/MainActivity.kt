package com.example.showcaseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.showcaseapplication.ui.theme.ShowcaseApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowcaseApplicationTheme {
                PositioningTask()
            }
        }
    }
}

@Composable
fun PositioningTask() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("Row Example", style = MaterialTheme.typography.headlineMedium)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
        ) {
            Text("Item 1", Modifier.background(Color.Red).padding(8.dp))
            Text("Item 2", Modifier.background(Color.Green).padding(8.dp))
            Text("Item 3", Modifier.background(Color.Blue).padding(8.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Column Example", style = MaterialTheme.typography.bodyMedium)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
        ) {
            Text("Item 1", Modifier.background(Color.Red).padding(8.dp))
            Text("Item 2", Modifier.background(Color.Green).padding(8.dp))
            Text("Item 3", Modifier.background(Color.Blue).padding(8.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Box Example", style = MaterialTheme.typography.bodyMedium)
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.LightGray)
        ) {
            Text("Top Start", Modifier.background(Color.Red).padding(8.dp))
            Text("Center", Modifier.background(Color.Green).padding(8.dp))
            Text("Bottom End", Modifier.background(Color.Blue).padding(8.dp))
        }
    }
}