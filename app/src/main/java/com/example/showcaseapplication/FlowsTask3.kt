package com.example.showcaseapplication

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    val numberFlow = flow {
        for (i in 1..5) {
            delay(200)
            emit(i)
        }
    }

    val stringFlow = flow {
        val letters = listOf("A", "B", "C", "D", "E")
        for (letter in letters) {
            delay(400)
            emit(letter)
        }
    }

    // TODO: Wypisz połączone liczby i litery z flow wyżej. Połącz najświeższe wyemitowane wartości
    //  Poszukaj jak to zrobić w dokumentacji: https://kotlinlang.org/docs/flow.html
}
