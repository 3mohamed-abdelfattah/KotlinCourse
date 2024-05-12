sealed class Sealed
data class Manger(val name: String, val age: Int) : Sealed()
class Senior(val name: String, val age: Int) : Sealed()
object jounior : Sealed()

fun main() {
    val employee: Sealed = Manger("Mody", 21)
    val massage = when (employee) {
        is Manger -> println("Manger")
        is Senior -> println("Senior")
        jounior -> println("jounior")
        else -> {
            println("None")
        }
    }
}