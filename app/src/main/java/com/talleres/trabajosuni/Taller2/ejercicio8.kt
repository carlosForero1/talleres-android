package com.talleres.trabajosuni.Taller2

fun main(args: Array<String>) {
    print("dime el numero de filas de la matriz: ")
    val numFilas = readln().toInt()

    print("dime el numero de columnas de la matriz: ")
    val numColum = readln().toInt()

    var matriz = Array(numFilas) { Array(numColum) { 0 } }
    println("\nVamos a llenar la matriz de $numFilas filas y $numColum columnas")

    for (filas in 0 until numFilas) {
        for (numColum in 0 until numColum) {
            print("Numero para la casilla [$filas][$numColum]: ")
            matriz[filas][numColum] = readln().toInt()
        }
    }

    println("\nmatriz original: ")
    for (filas in matriz) {
        println(filas.joinToString())
    }

    for(fila in 0 until numFilas){
        for (colum in 0 until numColum){
            if (matriz[fila][colum] < 0){
                matriz[fila][colum] = 0
            }else if (matriz[fila][colum] > 0){
                matriz[fila][colum] = 9
            }else{
                matriz[fila][colum] = 1
            }
        }
    }

    println("\nmatriz final: ")
    for (filas in matriz) {
        println(filas.joinToString())
    }
}