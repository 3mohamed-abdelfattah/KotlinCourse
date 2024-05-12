abstract class AbstractClass(val name: String) {
    abstract fun printName()
}

class B : AbstractClass("Abstract") {
    override fun printName() {
        println(name)
    }
}