package classes

class Cliente{
    var nome: String = ""
}

fun main(){
    val cliente = Cliente()
    cliente.nome = "joao"
    println("nome do cliente é ${cliente.nome}")
}