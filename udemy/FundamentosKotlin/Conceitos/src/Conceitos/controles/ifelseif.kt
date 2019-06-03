package Conceitos.controles

fun main(){
    val nota: Double = 93.2

    //usando range operator

    if (nota in 9..10){
        println("fantastico")
    } else if( nota in 6..8){
        println("ta bom")
    } else if(nota in 0..6) {
        println("deu ruim")
    } else{
        println("nota invalida")
    }

    println(5 in 7..4)
    println(5 in 4..7)
}