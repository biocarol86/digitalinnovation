package one.digitalinnovation.digionebank


abstract class Pessoa(//O open faz com que uma classe herde essa classe
    val nome: String,
    val cpf: String
    //private set //Só posso mexer no cpf no escopo da classe (set)-> função que atribui valor

)
