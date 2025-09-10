package com.talleres.trabajosuni.Taller2

fun main() {
    print("Número de empleados: ")
    val n = readln().toInt()

    val matriz = Array(n) { Array(3) { 0 } }
    val pagoNormal = 2350
    val pagoExtra = 3500

    for (i in 0 until n) {
        print("Código del empleado ${i + 1} (1-100): ")
        matriz[i][0] = readln().toInt()
        print("Horas normales trabajadas: ")
        matriz[i][1] = readln().toInt()
        print("Horas extra trabajadas: ")
        matriz[i][2] = readln().toInt()
    }

    println("\nInforme de empleados:")
    println("Código | Hrs Normales | $ Hrs Normales | Hrs Extra | $ Hrs Extra | Total $")
    for (i in 0 until n) {
        val codigo = matriz[i][0]
        val horasNormales = matriz[i][1]
        val horasExtra = matriz[i][2]
        val pagoHorasNormales = horasNormales * pagoNormal
        val pagoHorasExtra = horasExtra * pagoExtra
        val total = pagoHorasNormales + pagoHorasExtra

        println("$codigo\t$horasNormales\t$pagoHorasNormales\t$horasExtra\t$pagoHorasExtra\t$total")
    }
}
