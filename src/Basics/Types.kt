package Basics

fun main() {

    val name = "Kotlin"
    val type = ""
    val age: Int = 8

    val massgeTrim: String = """
        Hello,Dear
        My name Is Mohamed
        21 Years Old
    """.trimIndent()

    val massge: String = """
        Hello,Dear
        My name Is Mohamed
        21 Years Old
    """

    val massgeMargin: String = """
        --Hello,Dear
        --My name Is Mohamed
        --21 Years Old
    """.trimMargin("--")


    val massgeReplace: String = """
        Hello,Dear
        My name Is Mohamed
        21 Years Old
    """.replaceIndent("-")

    println("Name:$name,Empty? ${name.isEmpty()},Class:${name::class.java}")
    println("Type:$type,Empty? ${type.isEmpty()},Class:${type::class.java}")
    println("Age:$age,Empty? $age,Class:${age::class.java}")

    println(massge)
    println(massgeTrim)
    println(massgeReplace)
    println(massgeMargin)
    println(massgeMargin.length)

}