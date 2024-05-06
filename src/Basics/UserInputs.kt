
fun main() {

    println("Enter your Name:")
    val name = readln()
    println("Enter your Age:")
    var age = readln().toInt()
    age=2024-age
    println(name)
    println(age)

    println("----------------------------------")

    val value =name.split(' ')
    val firstChar = value[0].substring(0,2)
    val secoundChar = value[1].substring(0,2)
    println(firstChar+secoundChar)

}