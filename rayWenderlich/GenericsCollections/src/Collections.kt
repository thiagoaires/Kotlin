fun main() {
    val values = listOf(54,568,2,498,43,7498,2)
    println(values.filter { it > 50 })

    val listNames = listOf("Sam","Samuel", "Kyle", "Korver")

    println(listNames.first{ it.length > 5})
}