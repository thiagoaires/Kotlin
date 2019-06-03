package classes

class Calculadora{
    private var resultado: Int = 0

    fun somar(vararg valores: Int): Calculadora{
        valores.forEach{resultado += it}
        return this
    }
    fun print():Calculadora{
        println(resultado)
        return this
    }
    fun obtemResultado():Int{
        return resultado
    }
}

fun main(){
    var calculadora = Calculadora()
    calculadora.somar(2,4,6).print()
}