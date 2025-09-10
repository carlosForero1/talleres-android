package telefonoPlegable

open class TelefonoPlegable(var estaPlegado: Boolean = true) : Telefono() {
    override fun encender() {
        if (!estaPlegado) {
            luzPantallaEncendida = true
        }
    }

    fun plegar() {
        estaPlegado = true
    }

    fun desplegar() {
        estaPlegado = false
    }
}