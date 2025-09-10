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

    if (numFilas == numColum) {
        println("\nLa matriz es cuadrada")
    }

    var total = 0.0
    for (filas in 0 until numFilas) {
        for (colum in 0 until numColum) {
            total += matriz[filas][colum]
        }

    }

    if (total != 0.0) {
        total /= numFilas * numColum
        println("\nEl promedio de la matriz es: $total")
    }


    println()
    for (filas in 0 until numFilas) {
        var total = 0.0
        for (colum in 0 until numColum) {
            total += matriz[filas][colum]
        }
        total /= numColum * numFilas
        println("El promedio de la fila $filas es: $total")

    }

    println()
    for (colum in 0 until numColum) {
        var total = 0.0
        for (fila in 0 until numFilas) {
            total += matriz[fila][colum]
        }
        total /= numColum * numFilas
        println("El promedio de las columnas $colum es: $total")

    }

}


