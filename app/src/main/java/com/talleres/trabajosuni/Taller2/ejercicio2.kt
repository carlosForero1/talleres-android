package com.talleres.trabajosuni.Taller2

fun main(args: Array<String>) {
    print("Dime el numero de columans y filas de la matriz: ")
    val numMatriz = readLine()!!.toInt()

    val matriz = Array(numMatriz) { Array(numMatriz) { 0 } }

    for (i in 0 until numMatriz) {
        for (j in 0 until numMatriz) {
            print("Numero para la casilla [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println()
    print("Matriz original")
    println()
    for (i in matriz){
        println(i.joinToString())
    }

    println()
    print("Diagonal principal: ")
    for (i in 0 until numMatriz) {
        print(matriz[i][i].toString() + " ")
    }

    println()
    print("Diagonal secundaria: ")
    for (i in 0 until numMatriz) {
        for (j in 0 until numMatriz) {
            if (i + j == numMatriz - 1) {
                print(matriz[i][j].toString() + " ")
            }
        }
    }

    println()
    print("Diagonal triangular superior: ")
    for (i in 0 until numMatriz) {
        for (j in 0 until numMatriz) {
            if (i < j) {
                print(matriz[i][j].toString() + " ")
            }
        }
    }

    println()
    print("Diagonal triangular inferior: ")
    for (i in 0 until numMatriz) {
        for (j in 0 until numMatriz) {
            if (i > j) {
                print(matriz[i][j].toString() + " ")
            }
        }
    }
    println()
}