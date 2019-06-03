package funcoes

inline fun transacao(funcao: () -> Unit){
    println("iniciando transacao")
    try{
        funcao()
    } finally {
        println("Encerrando transacao")
    }
}

fun main(){
    transacao{
        println("Teste")
    }
}