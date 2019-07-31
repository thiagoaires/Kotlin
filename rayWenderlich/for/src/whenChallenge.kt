/**
 *
 */

fun main(args: Array<String>) {
/*
 ### when STATEMENTS

 Write a when statement that takes an age as an integer and prints out the life stage related to
 that age. You can make up the life stages, or use my categorization as follows: 0-2 years,
 Infant; 3-12 years, Child; 13-19 years, Teenager; 20-39, Adult;40-60, Middle aged; 61+, Elderly.
 */
    var age:Int = 12

    when(age){
        in 0..2 -> println("baby")
        in 3..12 -> println("infant")
        in 13..19 -> println("teenager")
        in 20..39 -> println("adult")
        else -> println("dead")
    }


/*
 Write a when statement that takes a pair containing a string and an integer.
 The string is a name, and the integer is an age. Use the same cases that you used
 in the previous exercise and println out the name followed by the life stage.
 For example, for the author of these challenges, it would println out "Kevin is middle aged.".
 */

    val guy = Pair("Kevin", 35)
    when(guy.second){
        in 0..2 -> println("baby ${guy.first}")
        in 3..12 -> println("infant${guy.first}")
        in 13..19 -> println("teenager${guy.first}")
        in 20..39 -> println("adult${guy.first}")
        else -> println("dead${guy.first}")
    }
    val personAge = when(age){
        in 0..2 -> "baby"
        in 3..12 -> "infant"
        in 13..19 -> "teenager"
        in 20..39 -> "adult"
        else -> "dead"
    }

    println(personAge)
/*
 * Write a when expression using the same when(myAge) as above but
 * set the result to personsAge and then print it.
 */
}