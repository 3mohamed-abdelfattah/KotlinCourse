data class `Data Class`(val name: String, val age: Int)

fun main() {
    val st1 = `Data Class`("Mohamed", 21)
    val st2 = `Data Class`("Aya", 15)
    val st3 = `Data Class`("Marwa", 22)
    val st4 = `Data Class`("Mohamed", 21)

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

}