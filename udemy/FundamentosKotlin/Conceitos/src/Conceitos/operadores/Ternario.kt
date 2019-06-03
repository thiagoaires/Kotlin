package Conceitos.operadores

fun obterNota(nota: Double):String = if(nota > 6.5) "passou" else "bombou"

fun main(){
    println(obterNota(7.5))
}