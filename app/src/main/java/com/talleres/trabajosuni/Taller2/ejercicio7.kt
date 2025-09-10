fun main() {
    // Pedir tamaño de la matriz
    print("Dime el número de filas de la matriz: ")
    val numFilas = readln().toInt()

    print("Dime el número de columnas de la matriz: ")
    val numColum = readln().toInt()

    // Crear matriz y llenarla
    val matriz = Array(numFilas) { i ->
        Array(numColum) { j ->
            print("Número para la casilla [$i][$j]: ")
            readln().toInt()
        }
    }

    println("\nMatriz original:")
    for (fila in matriz) println(fila.joinToString())

    // --- Eliminar fila ---
    print("\nDime la fila a eliminar (0 a ${numFilas - 1}): ")
    var x = readln().toInt()
    while (x !in 0 until numFilas) {
        print("Fila inválida. Intenta de nuevo: ")
        x = readln().toInt()
    }

    val matrizSinFila = Array(numFilas - 1) { fila ->
        if (fila < x) matriz[fila] else matriz[fila + 1]
    }

    println("Matriz sin la fila $x:")
    for (fila in matrizSinFila) println(fila.joinToString())

    // --- Eliminar columna ---
    print("\nDime la columna a eliminar (0 a ${numColum - 1}): ")
    var y = readln().toInt()
    while (y !in 0 until numColum) {
        print("Columna inválida. Intenta de nuevo: ")
        y = readln().toInt()
    }

    val matrizSinColumna = Array(matrizSinFila.size) { i ->
        Array(matrizSinFila[0].size - 1) { j ->
            if (j < y) matrizSinFila[i][j] else matrizSinFila[i][j + 1]
        }
    }

    println("Matriz sin la columna $y:")
    for (fila in matrizSinColumna) println(fila.joinToString())

    // --- Insertar nueva fila ---
    print("\nDime la posición para insertar nueva fila (0 a ${matrizSinColumna.size}): ")
    var filaInsert = readln().toInt()
    while (filaInsert !in 0..matrizSinColumna.size) {
        print("Posición inválida. Intenta de nuevo: ")
        filaInsert = readln().toInt()
    }

    val nuevaFila = Array(matrizSinColumna[0].size) { j ->
        print("Número para la nueva fila [$filaInsert][$j]: ")
        readln().toInt()
    }

    val matrizConFila = Array(matrizSinColumna.size + 1) { i ->
        when {
            i < filaInsert -> matrizSinColumna[i]
            i == filaInsert -> nuevaFila
            else -> matrizSinColumna[i - 1]
        }
    }

    println("Matriz con nueva fila en $filaInsert:")
    for (fila in matrizConFila) println(fila.joinToString())

    print("\nDime la posición para insertar nueva columna (0 a ${matrizConFila[0].size}): ")
    var colInsert = readln().toInt()
    while (colInsert !in 0..matrizConFila[0].size) {
        print("Posición inválida. Intenta de nuevo: ")
        colInsert = readln().toInt()
    }

    val matrizFinal = Array(matrizConFila.size) { i ->
        Array(matrizConFila[0].size + 1) { j ->
            when {
                j < colInsert -> matrizConFila[i][j]
                j == colInsert -> {
                    print("Número para la nueva columna [$i][$colInsert]: ")
                    readln().toInt()
                }
                else -> matrizConFila[i][j - 1]
            }
        }
    }

    println("Matriz final con nueva columna en $colInsert:")
    for (fila in matrizFinal) println(fila.joinToString())
}
