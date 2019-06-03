package Conceitos.operadores

data class Carro(var marca: String, val modelo: String)

fun main(){
    val (marca, carro) = Carro("ford", "focus")

    println("$marca $carro")

    val (marido, mulher) = listOf("Joao", "Maria")

    println("$marido e $mulher")

    val(_, _, terceiro) = listOf("Piquet", "Fittipaldi", "Senna")

    println("$terceiro 'e o melhor terceiro piloto BR")
}