package com.talleres.trabajosuni.Taller2

fun main(args: Array<String>) {

    print("Dime el numero de filas de la matriz:")
    val filas = readLine()!!.toInt()

    print("Dime el numero de columnas de la matriz:")
    val columnas = readLine()!!.toInt()

    val matriz = Array(filas) { Array(columnas) { 0 } }
    val matrizTranspuesta = Array(columnas) { Array(filas) { 0 } }

    println()
    print("Vamos a ingresar los numeros de la matriz de $filas filas y $columnas columnas")
    println()
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
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

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizTranspuesta[j][i] = matriz[i][j]
        }
    }
    println("\nMatriz transpuesta:")
    for (fila in matrizTranspuesta) {
        println(fila.joinToString(" "))
    }

}