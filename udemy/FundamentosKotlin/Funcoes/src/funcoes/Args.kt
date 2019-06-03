package funcoes

fun RelacaoDeTrabalho(chefe: String, funcionario:String):String{
    return "$chefe é patrao de $funcionario"
}

fun main(){
    println(RelacaoDeTrabalho("joao", "maria"))
    println(RelacaoDeTrabalho(funcionario = "Pedro", chefe = "Maria"))
}
