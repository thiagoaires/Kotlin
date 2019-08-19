fun main() {
    class Grade(var letter:Char, var points: Double, var credits: Double)

    open class Person(var firstName: String, var lastName: String)

    class Student(firstName: String,lastName: String,
                  var grades: ArrayList<Grade> = ArrayList()): Person(firstName, lastName){

        fun recordGrade(grade: Grade){
            grades.add(grade)
        }
    }

    val john = Person("JOao", "Snow")
    val thi = Student("Thiago", "Aires")

    println("${john.lastName} ${thi.firstName}")

    val history = Grade('B', points = 9.0, credits = 3.0)

    thi.recordGrade(history)

    println(thi.grades.first().points)
}