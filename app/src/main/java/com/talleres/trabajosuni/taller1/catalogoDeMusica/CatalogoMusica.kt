package Ejercicios

import catalogoDeMusica.Cancion

fun main() {

    val cancionBruno = Cancion("No se habla de Bruno", "Reparto de Encanto", 2022, 1_000_000)
    cancionBruno.imprimirDescripcion()
    println(cancionBruno.esPopular)
}


