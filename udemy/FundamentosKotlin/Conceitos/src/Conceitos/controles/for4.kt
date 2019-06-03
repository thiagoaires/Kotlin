package Conceitos.controles

fun main(){
    val alunos = arrayListOf("andre", "carla", "bacon")
    for((index, aluno) in alunos.withIndex())
        println("${index + 1} -  $aluno")
}