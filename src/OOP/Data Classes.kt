data class DataClass(val name: String="Unknown", val age: Int=0)

fun main() {
    val st1 = DataClass("Mohamed", 21)
    val st2 = DataClass("Aya", 15)
    val st3 = DataClass("Marwa", 22)
    val st4 = DataClass("Mohamed", 21)

    println(st1 == st4)
    println("=============================")
    println(st1 == st2)
    println("=============================")
    println(
        """
        $st1
        $st2
        $st3
        $st4
    """.trimIndent()
    )
    println("=============================")
    val (name2,age) = DataClass(age = 2)
    println(name2)
    println(age)
}