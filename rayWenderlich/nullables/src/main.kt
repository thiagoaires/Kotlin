/**
 *
 */
fun main(args: Array<String>) {

    val myFavSong: String? = "Thiago"

    myFavSong.let {
        println("$it")
    }

    val otherSong : String? = null

    otherSong?.let{
        println(it)
    }

    otherSong?.let{
        println(it)
    } ?: println("not song")

    fun printNick(nick: String?){
        nick?.let{
            println(nick)
        } ?: println("NIckless")
    }

    printNick(null)
}
