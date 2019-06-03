package funcoes

class Operacoes{
    fun soma(a: Int, b: Int): Int{
        return a + b
    }
}

fun soma(a: Int, b: Int): Int =  a + b

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a, b)
}

fun main(){
    println(calc(2, 3, Operacoes()::soma))
    println(calc(2, 6, ::soma))
}