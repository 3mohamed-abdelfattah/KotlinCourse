class Setter {
    private var id: String = "28HJ37KQ919L2"
    var setAndGet: String
        get() = this.id
        set(value) {
            this.id = value
        }
}

fun main() {
    val obj1 = Setter()
    obj1.setAndGet = "69O0P2SJM21"
    println(obj1.setAndGet)
}