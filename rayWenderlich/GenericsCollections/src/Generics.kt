interface Repository<T>{
    fun addItem(item:T)
    fun removeItem(item:T)
}
class Person(val name: String){}

class PersonRepository : Repository<Person>{
    override fun addItem(item: Person) {
    }

    override fun removeItem(item: Person) {
    }
}

fun <T>printItem(item: T){
    println(item)
}
fun main() {
    printItem("Bacon")
    printItem(42)
}