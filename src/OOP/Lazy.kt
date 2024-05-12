fun main() {
    val obj: Test by lazy {
        println("TEST")
        Test("Samar")
    }
    println(obj)
    println(obj.toString())
}

class Test(val name: String) {
    init {
        println("Hi $name")
    }
}