package catalogoDeMusica

class Cancion(
    val titulo: String,
    val artista: String,
    val añoPublicacion: Int,
    val cantidadReproducciones: Int
) {
    val esPopular: Boolean
        get() = cantidadReproducciones >= 1000

    fun imprimirDescripcion() {
        println("$titulo, interpretada por $artista, fue publicada en $añoPublicacion.")
    }
}