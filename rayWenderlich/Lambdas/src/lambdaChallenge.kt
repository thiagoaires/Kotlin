/**
 *
 */
fun main(args: Array<String>) {
    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    // Your Solution Here

    var sumInt = listOf<Int>(1, 64, 23, 5, 6)

    var totalSum: Int = sumInt.filter{ it > 5}.sum()
    println(totalSum)
    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val name: String, val age: Int)
    val sam = Person("Sam", 30)

    // Your Solution Here

    /**
     * Print out the index and value of the map below
     */
    val names = mapOf<String, Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)

    for((name, age) in names){
        println("$name have $age yo")
    }
    // Your Solution Here

}