package com.talleres.trabajosuni.Taller2

fun main() {
    val n = 5

    val matriz = Array(n) { IntArray(n) {0} }

    for (filas in 0 until n){
        for (colum in 0 until  n){
            if (matriz[filas][colum] == matriz[0][colum]){
                matriz[filas][colum] = 1
            }else{
                matriz[filas][colum] = 0
            }

            if (filas + colum == n - 1) {
                matriz[filas][colum] = 1
            }

            if (filas == n-1){
                matriz[filas][colum] = 1
            }
            if (filas == 0){
                matriz[filas][colum] = 1
            }
        }

    }

    for (filas in matriz){
        println(filas.joinToString(" "))
    }

}
