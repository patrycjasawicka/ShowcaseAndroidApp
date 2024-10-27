package com.example.showcaseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.showcaseapplication.ui.theme.ShowcaseApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowcaseApplicationTheme {
                TemperatureConverterState()
            }
        }
    }
}

fun convertCelsiusAndFahrenheit(isCelsiusToFahrenheit: Boolean, temperature: String): Float =
    if (isCelsiusToFahrenheit) {
        ((temperature.toFloatOrNull() ?: 0f) * 9 / 5) + 32
    } else {
        ((temperature.toFloatOrNull() ?: 0f) - 32) * 5 / 9
    }

@Composable
fun TemperatureConverterState() {
    // TODO: Stwórz stan, który będzie przechowywał temperaturę, stan checkboxa (isCelsiusToFahrenheit) i wynik konwersji
    // Wykorzystaj do tego remember, derivedStateOf i callbacki

//    TemperatureConverter()
}

@Composable
private fun TemperatureConverter(
    temperatureInput: String,
    onTemperatureChanged: (String) -> Unit,
    isCelsiusToFahrenheit: Boolean,
    onIsCelsiusChanged: (Boolean) -> Unit,
    convertedTemperature: Float
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            value = temperatureInput,
            onValueChange = onTemperatureChanged,
            label = { Text("Enter temperature") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Celsius to Fahrenheit")
            Checkbox(
                checked = isCelsiusToFahrenheit,
                onCheckedChange = onIsCelsiusChanged
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Converted Temperature: $convertedTemperature",
            style = MaterialTheme.typography.headlineMedium
        )
    }
}
