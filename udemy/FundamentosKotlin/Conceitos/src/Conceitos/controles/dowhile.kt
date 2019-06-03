package Conceitos.controles

fun main(){
    var opt: Int = 0
    do {
        val line = readLine() ?: "0"
        opt = line.toIntOrNull() ?: 0
        println(opt)
    } while(opt != 1)

    println("flw vlw")
}