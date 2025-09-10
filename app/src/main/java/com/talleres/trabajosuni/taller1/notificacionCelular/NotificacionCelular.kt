package Ejercicios

fun main() {
    val notificacionesDeLaMañana = 36
    val notificacionesDeLaTarde = 140

    MostrarResultadoNotificacion(notificacionesDeLaMañana)
    MostrarResultadoNotificacion(notificacionesDeLaTarde)
}

fun MostrarResultadoNotificacion(mensajes: Int) {
    if (mensajes < 100) {
        println("Tienes $mensajes notificaciones.")
    } else {
        println("Tienes 99+ notificaciones.")
    }
}
