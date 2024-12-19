package com.example.showcaseapplication

fun main() {
    getInputNumbers()
        .map { number ->
            getSquare(number)
        }.forEach { square ->
            println("Squared value: $square")
        }
}

// TODO: Przerób przykład w taki sposób, żeby wartości były generowane i odczytywane asynchronicznie
//  Wykorzystaj do tego flow
private fun getInputNumbers() = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

private fun getSquare(number: Int) = number * number
