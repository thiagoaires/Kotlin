package funcoes

fun <A> List<A>.secondOrNull(): A? = if (this.size >= 2) this.get(1) else null

fun main(){
    val list = listOf("joap", "mariao", "zezim")
    val numeros = listOf(1, 4, 754)
    println(list.secondOrNull())
    println(numeros.secondOrNull())
}