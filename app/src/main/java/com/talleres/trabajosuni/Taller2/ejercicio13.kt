package com.talleres.trabajosuni.Taller2

fun main() {
    print("Ejercicio 13 - Introduce N impar > 3: ")
    val n = readln().toInt()
    if (n <= 3 || n % 2 == 0) {
        println("N inválido")
        return
    }

    val matriz = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == 0 || j == 0 ||j == n - 1 ){
                matriz[i][j] = 1
            }else if (i == n-1){
                continue
            }else{
                matriz[i][j] = 4

            }
        }
    }

    println("Matriz Ejercicio 13:")
    for (i in 0 until n) {
        println(matriz[i].joinToString(" "))
    }

}
