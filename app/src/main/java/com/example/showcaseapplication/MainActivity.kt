package com.example.showcaseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.showcaseapplication.ui.theme.ShowcaseApplicationTheme
import com.example.showcaseapplication.navigation.AppNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowcaseApplicationTheme {
                AppNavHost(navController = rememberNavController())
            }
        }
    }
}