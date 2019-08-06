fun main() {
    val names = listOf("Thiago", "Aires", "Henrique", "Leidy")
    println(names)

    val teamNames = mutableListOf<String>("Eymael", "Democrata","cristao", "PSDC")
    teamNames.addAll(names)
    println(teamNames)

    teamNames.add("Grosjean")
    println(teamNames)

    teamNames.remove("cristao")
    println(teamNames)

    for(name in teamNames){
        println("names $name")
    }
}