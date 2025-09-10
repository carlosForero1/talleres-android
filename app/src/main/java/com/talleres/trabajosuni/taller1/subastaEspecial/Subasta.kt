package Ejercicios

import subastaEspecial.Oferta
import subastaEspecial.precioSubasta

fun main() {
    val ofertaGanadora = Oferta(5000, "Coleccionista privado")

    println("El artículo A se vendió en ${precioSubasta(ofertaGanadora, 2000)}.")
    println("El artículo B se vendió en ${precioSubasta(null, 3000)}.")
}

