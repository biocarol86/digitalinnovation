package one.digitalinnovation.digionebank


class Pessoa {
    val nome: String = "Jether"
    val cpf: String = "233.455.333-00"

    inner class Endereco{
        var rua: String = "Rua do Teste"
    }
}
fun main (){
    val jether = Pessoa()
    
    println(jether.nome)
    println(jether.cpf)
}

