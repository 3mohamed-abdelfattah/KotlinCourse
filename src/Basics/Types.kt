package Basics
fun main() {

    val name = "Kotlin"
    val type = ""
    val age : Int = 8
    val massgeTrim = """
        Hello,Dear
        My name Is Mohamed
        21 Years Old
    """.trimIndent()
    val massge = """
        Hello,Dear
        My name Is Mohamed
        21 Years Old
    """

    println("Name:$name,Empty? ${name.isEmpty()},Class:${name::class.java}")
    println("Type:$type,Empty? ${type.isEmpty()},Class:${type::class.java}")
    println("Age:$age,Empty? $age,Class:${age::class.java}")

    println(massge)
    println(massgeTrim)

}