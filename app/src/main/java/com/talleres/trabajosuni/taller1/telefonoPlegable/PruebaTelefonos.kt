package Ejercicios

import telefonoPlegable.TelefonoPlegable

fun main() {
    val nuevoTelefonoPlegable = TelefonoPlegable()

    nuevoTelefonoPlegable.encender()
    nuevoTelefonoPlegable.verificarLuzPantalla()
    nuevoTelefonoPlegable.desplegar()
    nuevoTelefonoPlegable.encender()
    nuevoTelefonoPlegable.verificarLuzPantalla()
}
