fun main() {

    val obj = Info1("Mohamed", "Mansour")
    obj.age = "30"
    println(obj.toString())
}

class Info1(val name: String, val last: String) {

    lateinit var age: String
    private fun info1Print() = "$name $last"

    override fun toString(): String {
        return info1Print() + " _ Age : $age"
    }

}