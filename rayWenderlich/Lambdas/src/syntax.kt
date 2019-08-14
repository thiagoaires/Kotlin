fun main() {
    fun handleInteger(myInt: Int, operator: (Int) -> Unit){
        operator(myInt)
    }

    handleInteger(5, {println("my horse is amazing $it")})

    fun printResult(myInt: Int){
        println("amazing result: $myInt")

    }

    handleInteger(10, ::printResult)
}