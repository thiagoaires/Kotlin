package Conceitos.operadores

fun main(){
    val valor = "as"

    if (valor is String){
        println("eh string")
    }
    if (valor !is String)
        println("nao eh string")
}