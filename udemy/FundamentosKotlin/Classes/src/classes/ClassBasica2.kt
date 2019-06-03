package classes

class Pessoa1(val nome: String)
class Pessoa2(var nome: String)
class Pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}

fun main(){
    val p1 = Pessoa1("Joeao")

    val p2 = Pessoa2("Serafim")
    p2.nome = "Kevin Bancon"

    val p3 = Pessoa3(nomeInicial = "Obrama")


    println("${p1.nome} ${p2.nome} ${p3.nome}")
}