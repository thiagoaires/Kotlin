package Conceitos

import Conceitos.pacoteA.simplesFuncao as funcaoSimples
import Conceitos.pacoteA.Coisa
import Conceitos.pacoteA.FaceMoeda.CARA
import Conceitos.pacoteB.*

fun main(){
    kotlin.io.println(funcaoSimples("bom dia"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)
println("${soma(2, 3)} ${subtracao(3, 7)}")
}