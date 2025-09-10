package com.talleres.trabajosuni.Taller2

fun main() {
    val n = 11
    val matriz = Array(n) { IntArray(n) { 4 } }

    for (i in 0 until n) {
        for (j in 0 until n) {

            if (i == j || i + j == n - 1) {
                matriz[i][j] = 1
            }

            if ( j == 0 || j == n - 1) {
                matriz[i][j] = 1
            }

            if (i == n / 2) {
                matriz[i][j] = 1
            }

            if (i > j && i + j < n - 1) {
                matriz[i][j] = 1
            }
            if (i < j && i + j > n - 1) {
                matriz[i][j] = 1
            }
        }
    }

    println("Matriz Ejercicio 12:")
    for (fila in matriz) println(fila.joinToString(" "))
}
