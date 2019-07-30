/**
 *
 */
fun main(args: Array<String>) {
/* Pairs and Triples
 Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
 */
    val dates = Pair(12, 3)
    val (day, month) = dates
    println("$day/$month")
/*
 In one line, read the day and month values into two constants.
 */
    val newDay = dates.first
    val newMonth = dates.second

    println("$newDay/$newMonth")
/*
 Now create a Triple using the month, day and year */

    val completeDate = Triple(13,6, 1984)
    val (dia, mes, ano) = completeDate
    println("$dia/$mes/$ano")
}