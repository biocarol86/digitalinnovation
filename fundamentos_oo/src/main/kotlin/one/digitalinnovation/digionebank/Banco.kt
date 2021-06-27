package one.digitalinnovation.digionebank

data class Banco(      //dataclass serve para armazenar uma informação que não quer modificar
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
