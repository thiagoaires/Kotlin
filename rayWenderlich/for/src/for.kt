fun main() {
    val count = 5
    for(i in 1..count){
        println (i)
        if(i == 3)
            continue

        println("goodbye")
    }

    val animal = "cat"

    when(animal){
        "dog", "cat" -> println("animal is in house pt")
        else -> println("animal is out")
    }
}