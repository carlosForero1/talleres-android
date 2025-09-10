package com.talleres.trabajosuni.Taller2

fun main() {
    print("Dime el número de estudiantes: ")
    val numEstudiantes = readln().toInt()
    val numMaterias = 6

    val calificaciones = Array(numEstudiantes) { i ->
        Array(numMaterias) { j ->
            print("Calificación del estudiante ${i + 1}, materia ${j + 1}: ")
            readln().toInt()
        }
    }

    println("\nMatriz de calificaciones:")
    for (fila in calificaciones) println(fila.joinToString())

    println("\nPromedio de cada estudiante:")
    for (i in 0 until numEstudiantes) {
        val suma = calificaciones[i].sum()
        val promedio = suma.toDouble() / numMaterias
        println("Estudiante ${i + 1}: $promedio")
    }

    println("\nResumen por materia:")
    for (j in 0 until numMaterias) {
        var aprobados = 0
        var reprobados = 0
        var sumaColumna = 0

        for (i in 0 until numEstudiantes) {
            val nota = calificaciones[i][j]
            sumaColumna += nota
            if (nota >= 60) aprobados++ else reprobados++
        }

        val promedioMateria = sumaColumna.toDouble() / numEstudiantes
        println("Materia ${j + 1}: Promedio = $promedioMateria, Aprobados = $aprobados, Reprobados = $reprobados")
    }
}
