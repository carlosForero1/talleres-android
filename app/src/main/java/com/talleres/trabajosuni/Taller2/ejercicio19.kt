package com.talleres.trabajosuni.Taller2

fun main() {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    var num = 1
    var row = n / 2
    var col = n / 2
    matriz[row][col] = num++
    var step = 1

    while (num <= n * n) {
        for (i in 0 until step) {
            if (num > n * n) break
            row--
            matriz[row][col] = num++
        }

        for (i in 0 until step) {
            if (num > n * n) break
            col++
            matriz[row][col] = num++
        }
        step++

        for (i in 0 until step) {
            if (num > n * n) break
            row++
            matriz[row][col] = num++
        }

        for (i in 0 until step) {
            if (num > n * n) break
            col--
            matriz[row][col] = num++
        }
        step++
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}
