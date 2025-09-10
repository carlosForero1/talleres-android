fun main(args: Array<String>) {

    print("Dime las filas de la matriz: ")
    val filas = readLine()!!.toInt()

    print("Dime las columnas de la matriz: ")
    val colum = readLine()!!.toInt()

    print("Dime el numero por el que se quiere multiplicar: ")
    val multiplicador = readLine()!!.toInt()

    val matriz = Array(filas) { Array(colum) { 0 } }

    print("Vamos a ingresar los numeros de la matriz de $filas filas y $colum columnas: ")
    println()
    for (i in 0 until filas) {
        for (j in 0 until colum) {
            print("Numero para la casilla [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println()
    print("Matriz original")
    println()
    for (fila in matriz) {
        println(fila.joinToString(" "))
    }

    println()
    println("Matriz modificada")
    for (fila in matriz.indices) {
        for (columnas in matriz[fila].indices) {
            matriz[fila][columnas] *= multiplicador
            print(matriz[fila][columnas].toString() + " ")
        }
        println()
    }
}


