/**
 *
 */
fun main(args: Array<String>) {
/*
 ### Lists
 Create a list with the following states that you have lived in:
 */

    val myList = mutableListOf("RJ", "SP", "MA", "MG")

    // Your solution here

    // Add a new State
    myList.add("SC")
    println(myList)
/*
Given a function to print out all states but the third index
*/
    fun myStatesOfSmash(){
        myList.forEachIndexed{
                idx, state ->
            if(idx != 3)  println(state)

        }
    }

    myStatesOfSmash()
    // Your solution here

}
