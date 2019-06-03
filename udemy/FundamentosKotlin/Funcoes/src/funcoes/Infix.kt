package funcoes

class Produto(val nome: String, val preco: Int)

infix fun Produto.MaisCaroQue(produto: Produto):Boolean = this.preco > produto.preco

fun main(){
    val p1 = Produto("bacon", 2000)
    val p2 = Produto(preco = 12, nome = "cebola")

    println(p1 MaisCaroQue p2)
    println(p2 MaisCaroQue p1)
}