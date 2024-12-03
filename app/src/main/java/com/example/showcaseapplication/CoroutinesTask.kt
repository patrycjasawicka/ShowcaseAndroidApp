package com.example.showcaseapplication

import kotlinx.coroutines.*

private fun calculateSumOfOddNumbers(numbers: List<Int>) {
    val oddSquares = numbers.filter { it % 2 != 0 }.sumOf { it }
    println("Sum of odd squares: $oddSquares")
}

private fun calculateSumOfEvenNumbers(numbers: List<Int>) {
    val evenSquares = numbers.filter { it % 2 == 0 }.sumOf { it }
    println("Sum of even squares: $evenSquares")
}

fun main() {
    println("Main program starts on thread: ${Thread.currentThread().name}")

    val numbers = listOf(1, 2, 3, 4, 5)

    // TODO: Wykonaj funkcje niżej w osobnych korutynach i poczekaj na ich wynik, wykorzystaj do tego runBlocking
    calculateSumOfEvenNumbers(numbers)
    calculateSumOfOddNumbers(numbers)

    println("All computations are complete.")
    println("Main program ends on thread: ${Thread.currentThread().name}")
}
