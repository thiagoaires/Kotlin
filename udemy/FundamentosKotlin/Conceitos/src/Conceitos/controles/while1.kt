package Conceitos.controles

fun main(){
    var opcao: Int = 0

    while(opcao != -1){
        var line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("vc digitou $opcao")
    }

    println("ate a prox")
}