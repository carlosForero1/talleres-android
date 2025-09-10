package com.talleres.trabajosuni.Taller2

fun main() {
    val n = 5 // puedes cambiar por cualquier impar > 3
    val matriz = Array(n) { IntArray(n) }

    var num = 1
    var top = 0
    var bottom = n - 1
    var left = 0
    var right = n - 1

    while (num <= n * n) {
        // 1. Izquierda -> Derecha (fila superior)
        for (j in left..right) {
            matriz[top][j] = num++
        }
        top++

        // 2. Arriba -> Abajo (columna derecha)
        for (i in top..bottom) {
            matriz[i][right] = num++
        }
        right--

        // 3. Derecha -> Izquierda (fila inferior)
        for (j in right downTo left) {
            matriz[bottom][j] = num++
        }
        bottom--

        // 4. Abajo -> Arriba (columna izquierda)
        for (i in bottom downTo top) {
            matriz[i][left] = num++
        }
        left++
    }

    // Imprimir matriz
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}
