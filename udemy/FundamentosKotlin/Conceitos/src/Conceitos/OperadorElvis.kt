package Conceitos

fun main(){
    val opcional: String? = "Opt"
    val obrigatorio: String = opcional ?: "valor padrao"


    println(obrigatorio)
}
