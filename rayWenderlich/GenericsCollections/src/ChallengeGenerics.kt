fun main() {

    /**
     * Create a function named printItem that prints out a generic parameter.
     * Call the parameter "item"
     */
    fun <T>printItem(item: T){
        println(item)
    }

    printItem(21)
    printItem("das")
    // Your Solution Here


    /**
     * Create a function named printList that takes a generic list as a parameter
     * and prints out each item
     */
    val lista = listOf("Jessica", "Jenyfer", "Bacon", "Bola")
    fun <T>printList(itens: List<T>){

        for(item in itens){
            println(item)
        }

    }

    printList(lista)
    // Your Solution Here
}