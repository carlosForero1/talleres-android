package Ejercicios

import perfilDeInternet.Persona

fun main() {
    val amanda = Persona("Amanda", 33, "jugar tenis", null)
    val atiqah = Persona("Atiqah", 28, "escalar", amanda)

    amanda.mostrarPerfil()
    atiqah.mostrarPerfil()
}

