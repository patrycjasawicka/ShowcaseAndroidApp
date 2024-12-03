package com.example.showcaseapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.showcaseapplication.ui.GreetingScreen
import com.example.showcaseapplication.ui.SecondaryScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavigationItem.First.route
    ) {
        composable(NavigationItem.First.route) {
            GreetingScreen(navController)
        }
        // TODO: Przekaż do drugiego ekranu argument dostępny w obiekcie backstack entry
        composable(NavigationItem.Second.route) {
            SecondaryScreen()
        }
    }
}