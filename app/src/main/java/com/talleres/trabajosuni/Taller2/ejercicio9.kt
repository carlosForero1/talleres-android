fun main() {
    print("Dime el número de sucursales: ")
    val numFilas = readln().toInt()
    val numMeses = 12

    val matriz = Array(numFilas) { i ->
        Array(numMeses) { j ->
            print("Número para la casilla [Sucursal ${i+1}][Mes ${j+1}]: ")
            readln().toInt()
        }
    }

    println("\nMatriz de ventas original:")
    for (fila in matriz) println(fila.joinToString())

    var totalCompañia = 0
    var sucursalMaxVenta = 0
    var maxVentaSucursal = 0
    var sucursalMinVenta = Int.MAX_VALUE
    var minVentaSucursal = 0

    val ventasPorMes = IntArray(numMeses) { 0 }

    for (i in 0 until numFilas) {
        var totalSucursal = 0
        for (j in 0 until numMeses) {
            totalSucursal += matriz[i][j]
            ventasPorMes[j] += matriz[i][j]
        }
        println("Total de ventas de la sucursal ${i + 1}: $totalSucursal")
        totalCompañia += totalSucursal

        if (totalSucursal > sucursalMaxVenta) {
            sucursalMaxVenta = totalSucursal
            maxVentaSucursal = i + 1
        }

        if (totalSucursal < sucursalMinVenta) {
            sucursalMinVenta = totalSucursal
            minVentaSucursal = i + 1
        }
    }

    var minVentasMes = ventasPorMes[0]
    var mesMinVenta = 1
    for (j in 1 until numMeses) {
        if (ventasPorMes[j] < minVentasMes) {
            minVentasMes = ventasPorMes[j]
            mesMinVenta = j + 1
        }
    }

    println("\nTotal de ventas de la compañía: $totalCompañia")
    println("Sucursal que más vendió: Sucursal $maxVentaSucursal con $sucursalMaxVenta")
    println("Sucursal que menos vendió: Sucursal $minVentaSucursal con $sucursalMinVenta")
    println("Mes que menos vendió la compañía: Mes $mesMinVenta con $minVentasMes")
}
