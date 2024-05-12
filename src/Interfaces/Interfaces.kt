interface Interface1 : Interface2, Interface3, Interface4 {
    fun bar()
    fun toolBar()
    fun back()
}

interface Interface2 {
    fun bar2()
}

interface Interface3 {
    fun bar3()
}

interface Interface4 {
    fun bar4()
}

class Demo : Interface1 {
    override fun bar() {
        println("Bar")
    }

    override fun toolBar() {
        println("Tool Bar")
    }

    override fun back() {
        println("Back")
    }

    override fun bar2() {
        println("Bar 2")
    }

    override fun bar3() {
        println("Bar 3")
    }

    override fun bar4() {
        println("Bar 4")
    }
}

fun main() {
    val obj1 = Demo()
    obj1.bar()
    obj1.toolBar()
    obj1.bar4()
    obj1.bar3()
}