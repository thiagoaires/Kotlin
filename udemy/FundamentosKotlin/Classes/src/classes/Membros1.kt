package classes

class Data(var dia:Int, var mes:Int, var ano:Int){
    fun formatar():String{
        return "${this.dia}/${this.mes}/${this.ano}"
    }
}

fun main(){
    var nascimento: Data = Data(dia = 11, mes = 12, ano = 2019)
    with(nascimento){
        println(formatar())
    }
}