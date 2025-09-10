package telefonoPlegable

open class Telefono(var luzPantallaEncendida: Boolean = false) {
    open fun encender() {
        luzPantallaEncendida = true
    }

    fun apagar() {
        luzPantallaEncendida = false
    }

    fun verificarLuzPantalla() {
        val estado = if (luzPantallaEncendida) "encendida" else "apagada"
        println("La luz de la pantalla del teléfono está $estado.")
    }
}
