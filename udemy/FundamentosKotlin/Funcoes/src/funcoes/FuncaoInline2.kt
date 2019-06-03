package funcoes
inline fun <T> executandoComLog(nomeFuncao: String, funcao: () -> T): T{
    println("entrando com metodo $nomeFuncao")
    try{
        return funcao()
    } finally{
        println("$nomeFuncao finalizado")
    }
}
fun somaMais(a: Int, b: Int):Int{
    return a + b
}
fun main(){
    val resultado = executandoComLog("somador"){
        somaMais(2, 3)
    }
    println(resultado)
}