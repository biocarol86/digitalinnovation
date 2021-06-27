package one.digitalinnovation.digionebank


class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "233.455.333-00"
    private set //Só posso mexer no cpf no escopo da classe (set)-> função que atribui valor


}
fun main (){
    val jether = Pessoa()
    
    println(jether)
    println(jether.nome)
    println(jether.cpf)
}

