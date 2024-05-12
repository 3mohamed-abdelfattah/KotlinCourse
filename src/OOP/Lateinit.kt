fun main() {
    val obj = MyInfo()
    obj.setValue("Aaaa")
    println(obj.getValue())

}

class MyInfo {
    lateinit var myName: String
    fun setValue(name: String) {
        myName = name
    }

    fun getValue() = myName
}