data class SuperClass(val cost: String = "Unknown") : Inheritance() {
    //This
    fun printThis() = println(this.cost)

    //Super
    fun printSuper() = println(super.age)
}

fun main() {
    val thisPrint = SuperClass(11350.toString())
    thisPrint.age = 20
    println(thisPrint.printThis())
    println(thisPrint.printSuper())
}