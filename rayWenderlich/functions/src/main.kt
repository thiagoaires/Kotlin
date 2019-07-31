/**
 *
 */
fun main(args: Array<String>) {
/*
 ### BASIC Functions

 Write a funtion named `printFullName` that takes two strings called `firstName` and `lastName`.
 The funtion should print out the full name defined as `firstName` + " " + `lastName`.
 Use it to print out your own full name using the parameter names.
 *//*

fun printFullName(firstName: String = "primeiro nome", lastName: String = "ultimo nome"){
    println("$firstName + $lastName")
}
    printFullName("Thiago", "Aires")
    // Your solution Here

*/
/*
 Use the printFullName function without any parameter names.
 *//*


    // Your solution Here
    printFullName()

*/
/*
Write a funtion named `calculateFullName` that returns the full name as a string.
Use it to store your own full name in a constant and then print it.
*//*


    // Your solution Here
    fun calculateFullName(fullName: String):String{
        val completeName = fullName
        return  completeName
    }

    println(calculateFullName("ThiagoAires"))
*/
/*
 Create `calculateFullNameWithLength` to return a pair containing both the full name and the
 length of the name. You can find a string’s length by using the following
 syntax: `string.length`. Use this funtion to determine the length
 of your own full name. Then print out the result of the function.
 *//*


    // Your solution Here
    fun calculateFullNameWithLength(firstName: String, lastName: String): Pair<String, Int>{
        var fullName = "$firstName $lastName"
        return Pair(fullName, fullName.length)
    }
    print(calculateFullNameWithLength("THiagoAS", "Eymael"))
*/

    fun add (x: Int, y: Int):Int{
        return x + y
    }
    println(add(2, 3))

    var function : (Int, Int) -> Int = ::add

    println(function(2, 5))

    fun sub(x: Int, y: Int): Int{
        return x-y
    }

    function = ::sub


    println(function(10, 1))
}