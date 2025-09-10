package com.talleres.trabajosuni.Taller2

fun main(args: Array<String>) {
    println("Vamos a llenar dos matrices")
    var matrices = Array(2){ arrayOf<IntArray>() }

    for (i in 0 until 2) {
        println("MATRIZ #${i+1}")
        print("dime el numero de filas de la matriz: ")
        val numFilas = readln().toInt()

        print("dime el numero de columnas de la matriz: ")
        val numColum = readln().toInt()

        var matriz = Array(numFilas) { IntArray(numColum) { 0 } }
        println("\nVamos a llenar la matriz de $numFilas filas y $numColum columnas")

        for (filas in 0 until numFilas) {
            for (numColum in 0 until numColum) {
                print("Numero para la casilla [$filas][$numColum]: ")
                matriz[filas][numColum] = readln().toInt()
            }
        }
        matrices[i] = matriz
    }

    println("Imprimir dos matrices")
    for (i in 0 until 2){
        print("matriz ${i+1}")
        for (fila in matrices[i]){
            println(fila.joinToString(" "))
        }
        println()
    }


    val matriz1 = matrices[0]
    val matriz2 = matrices[1]

    if (matriz1.size == matriz2.size && matriz1[0].size == matriz2[0].size) {
        val filas = matriz1.size
        val columnas = matriz1[0].size
        val suma = Array(filas) { IntArray(columnas) }

        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j]
            }
        }

        println("Suma de las matrices:")
        for (fila in suma) {
            println(fila.joinToString(" "))
        }
    } else {
        println("Las matrices no tienen el mismo tamaño, no se puede sumar")
    }

    val columnasM1 = matriz1[0].size
    val filasM2 = matriz2.size

    if (columnasM1 == filasM2) {
        val filas = matriz1.size
        val columnas = matriz2[0].size
        val mult = Array(filas) { IntArray(columnas) { 0 } }

        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                for (k in 0 until columnasM1) {
                    mult[i][j] += matriz1[i][k] * matriz2[k][j]
                }
            }
        }

        println("Multiplicación de las matrices:")
        for (fila in mult) {
            println(fila.joinToString(" "))
        }
    } else {
        println("No se pueden multiplicar las matrices, columnas de la 1 ≠ filas de la 2")
    }



}