
fun main() {

    val name = "Kotlin"
    var type = ""
    val age : Int = 8

    println("Name:$name,Empty? ${name.isEmpty()},Class:${name::class.java}")
    println("Type:$type,Empty? ${type.isEmpty()},Class:${type::class.java}")
    println("Age:$age,Empty? $age,Class:${age::class.java}")

}