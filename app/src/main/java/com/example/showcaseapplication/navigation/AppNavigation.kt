package com.example.showcaseapplication.navigation

enum class Screen {
    FIRST,
    SECOND,
}

const val ARGUMENT = "example"

sealed class NavigationItem(val route: String) {
    data object First : NavigationItem(Screen.FIRST.name)
    data object Second : NavigationItem("${Screen.SECOND.name}/{$ARGUMENT}") {
        fun getRoute(arg: String) = "${Screen.SECOND.name}/$arg"
    }
}