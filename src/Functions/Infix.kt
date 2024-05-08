fun main() {
    val sum = 100 addInfix 50 //infix call
    val sumNot = 10.addInfix(5) //infix call
    println(sum)
    println(sumNot)
}

infix fun Int.addInfix(value: Int) = this + value
