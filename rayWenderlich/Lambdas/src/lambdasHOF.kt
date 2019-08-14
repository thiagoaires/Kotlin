fun main() {

    val ints = listOf(2, 3, 45, 50)
    println(ints.filter{ it > 10})

    fun List<Int>.filter(operator: (Int) -> Boolean ){

    }

    val myStringList = listOf("BANCON", "EYMAEL", "thi", "henrique")

    val myUpList = myStringList.filter { it.length > 4 }.sortedBy { it }

    println(myUpList)
}