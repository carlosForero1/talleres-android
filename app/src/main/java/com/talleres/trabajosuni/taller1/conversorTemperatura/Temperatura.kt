package Ejercicios

fun main() {
    imprimirConversionFinal(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    imprimirConversionFinal(350.0, "Kelvin", "Celsius") { it - 273.15 }
    imprimirConversionFinal(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun imprimirConversionFinal(
    medidaInicial: Double,
    unidadInicial: String,
    unidadFinal: String,
    formulaConversion: (Double) -> Double
) {
    val medidaFinal = String.format("%.2f", formulaConversion(medidaInicial))
    println("$medidaInicial grados $unidadInicial son $medidaFinal grados $unidadFinal.")
}
