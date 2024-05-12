open class Anonymous(val name: String) {
    open fun printName() {
        println("Hi $name")
    }
}


fun main() {

    val helloWorld = object:Anonymous("Anonymous") {
        val hello = "Hello"
        val world = "World"
        override fun toString() = "$hello $world"
        val name2 = "Mohamed"
        fun printName2() {
            println("Hi $name2")
        }
    }
    helloWorld.printName()
    println("---------------------------------")
    println(helloWorld)
    println(helloWorld.printName2())

}