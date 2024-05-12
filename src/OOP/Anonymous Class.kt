open class Anonymous(val name: String) {
    open fun printName() {
        println("Hi $name")
    }
}


fun main() {

    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        override fun toString() = "$hello $world"
        val name = "Mohamed"
        fun printName() {
            println("Hi $name")
        }
    }
    val anonyPrint = Anonymous("Anonymous")
    println(anonyPrint.printName())
    println("---------------------------------")
    println(helloWorld)
    println(helloWorld.printName())

}