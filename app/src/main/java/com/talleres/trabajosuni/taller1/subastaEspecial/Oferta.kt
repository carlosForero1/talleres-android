package subastaEspecial

class Oferta(val monto: Int, val comprador: String)

fun precioSubasta(oferta: Oferta?, precioMinimo: Int): Int {
    return oferta?.monto ?: precioMinimo
}
