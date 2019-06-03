package funcoes

fun ordernar(vararg numeros: Int):IntArray{
    return numeros.sortedArray()
}

fun main(){
    for(numero in ordernar(3,5,456,3,78,1,24)){
        print("$numero ")
    }
}