class Generic<T>(val list: List<T>) {
    fun item(): List<T> {
        return list
    }
}

fun main() {
    val obj1: List<String> = listOf("Mohamed", "Sayed")
    val result1 = Generic(obj1)
    println(result1.item())
    println("-----------------")
    val obj2: List<Int> = listOf(53, 13)
    val result2 = Generic(obj2)
    println(result2.item())
}