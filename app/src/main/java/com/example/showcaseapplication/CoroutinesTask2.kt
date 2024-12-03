package com.example.showcaseapplication

import kotlinx.coroutines.*

private fun calculateSumOfOddNumbers(numbers: List<Int>): Int {
    val oddSquares = numbers.filter { it % 2 != 0 }.sumOf { it }
    println("Sum of odd squares: $oddSquares")
    return oddSquares
}

private fun calculateSumOfEvenNumbers(numbers: List<Int>): Int {
    val evenSquares = numbers.filter { it % 2 == 0 }.sumOf { it }
    println("Sum of even squares: $evenSquares")
    return evenSquares
}

fun main() = runBlocking {
    println("Main program starts on thread: ${Thread.currentThread().name}")

    val numbers = listOf(1, 2, 3, 4, 5)

    // TODO: Wykonaj funkcje niżej w osobnych korutynach. Podaj sumę ich wartości. Wykorzystaj do tego async await
    val evenSumDeferred =  calculateSumOfEvenNumbers(numbers)
    val oddSumDeferred =  calculateSumOfOddNumbers(numbers)

    val totalSum = 0
    println("Total sum of squares: $totalSum")

    println("Main program ends on thread: ${Thread.currentThread().name}")
}
