fun main() {

    val evenNumbers = arrayOf(2, 4,6,8)

    val evenNumbersExplict: Array<Int> = arrayOf(2, 4, 6, 8)

    val intNumbers = intArrayOf(2,4,6,8)

    val players: Array<String> = arrayOf("Albon", "Kvyat", "Grosjean", "Magnussen")

    val upcomingPlayers = players.slice(0..2)

    println(upcomingPlayers)

    for(player in upcomingPlayers) {
        println(player)
    }

    fun outOfHaas(player: String):Boolean{
        return !players.contains(player)
    }

    println(outOfHaas("Fittipaldi"))
    println(outOfHaas("Kvyat"))

    players[2] = "Obama"

    for (play in players){
        println(play)
    }

    fun sumItems(arr: Array<Int>){
        var sum = 0
        for (number in arr){
            sum += number
        }

        println(sum)
    }

    sumItems(evenNumbersExplict)


    val prices = arrayOf(1, 5, 20, 50)

    val removeFirst = prices.drop(1)
    println("------")
    println(prices.dropLast(2))

    println(removeFirst)
}