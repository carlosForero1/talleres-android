package perfilDeInternet

class Persona(val nombre: String, val edad: Int, val pasatiempo: String?, val referente: Persona?) {
    fun mostrarPerfil() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        if (pasatiempo != null) {
            print("Le gusta $pasatiempo. ")
        }
        if (referente != null) {
            print("Tiene como referente a ${referente.nombre}")
            if (referente.pasatiempo != null) {
                print(", a quien le gusta ${referente.pasatiempo}.")
            } else {
                print(".")
            }
        } else {
            print("No tiene referente.")
        }
        print("\n\n")
    }
}