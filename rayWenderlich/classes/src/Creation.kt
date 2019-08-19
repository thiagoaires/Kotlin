class Person(
    var firstName: String,
    var lastName: String
)
class Animal{

    var firstName: String
    var lastName: String

    constructor(firstName:String, lastName:String){
        this.firstName = firstName
        this.lastName = lastName
    }
}
fun main() {
    val person = Person("Shura", "Sowaka")
    val max = Animal("Max","bafudo")
    println("$person ${person.firstName} ${person.lastName}")
    println("$max ${max.firstName} ${max.lastName}")
}