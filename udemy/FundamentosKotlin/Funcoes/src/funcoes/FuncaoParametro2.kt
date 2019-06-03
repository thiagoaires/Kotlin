package funcoes

fun <W> filtrar(lista: List<W>, filtro: (W) -> Boolean): List<W>{
    val listaFiltrada = ArrayList<W>()

    for(e in lista){
        if(filtro(e)){
                listaFiltrada.add(e)
            }
    }
    return listaFiltrada
}

fun comTresLetras(nome:String): Boolean{
    return nome.length == 3
}

fun main(){
    val listaNomes = listOf("Ana", "Mariana conta 1", "Bacon", "Ivo", "Holanda", "Boy")
    return print(filtrar(listaNomes, ::comTresLetras))
}
