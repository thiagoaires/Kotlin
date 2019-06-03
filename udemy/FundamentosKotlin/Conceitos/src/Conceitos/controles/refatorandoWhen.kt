package Conceitos.controles

fun main(){
    val nota = 8

    when(nota){
        10, 9 -> println("Top")
        8, 7 -> println("parabens")
        6, 5, 4 -> println("tente recuperar")
        in 0..3 -> println("deu ruim")
        else -> println("nota invalida")
    }
}