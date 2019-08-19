fun main() {
    class Person(var firstName: String, var lastName:String){
        var fullName: String
        init{
            fullName = "$firstName $lastName"
        }

    }

    val person = Person("thiago", "aires")

    println(person.fullName)
}