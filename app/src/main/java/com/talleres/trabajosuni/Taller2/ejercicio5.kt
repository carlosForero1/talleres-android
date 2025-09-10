package com.talleres.trabajosuni.Taller2

fun main(args: Array<String>) {
    print("dime el numero de filas de la matriz: ")
    val numFilas = readln().toInt()

    print("dime el numero de columnas de la matriz: ")
    val numColum = readln().toInt()

    var matriz = Array(numFilas) { Array(numColum) { 0 } }
    println("\nVamos a llenar la matriz de $numFilas filas y $numColum columnas con ceros y unos para saber si es RALA")
    var rala = false
    var fallo = false
    for (filas in 0 until numFilas) {
        for (numColum in 0 until numColum) {
            print("Numero para la casilla [$filas][$numColum]: ")
            matriz[filas][numColum] = readln().toInt()
            if (matriz[filas][numColum] == 1){
                rala = true
            }else if (matriz[filas][numColum] > 1){
                println("numero superior a uno, no se podra determinar si RALA")
                fallo = true
                return
            }
        }
    }
    if (fallo){
        return
    }
    if (rala){
        println("\ntu matriz es RALA")
    }else{
        println("\ntu matriz no es RALA")
    }

    println("matriz original: ")
    for (filas in matriz) {
        println(filas.joinToString())
    }


}