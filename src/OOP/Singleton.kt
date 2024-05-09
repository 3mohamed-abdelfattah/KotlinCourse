fun main() {
    MyFood.name = "rice"
    println(MyFood.name)
    MyFood.list.add("tomatoes")
    MyFood.list.add("Washroom")
    MyFood.list.add("Caviar")
    println(MyFood.list)
}

object MyFood {
    var name = "Unknown"
    var list = mutableListOf<String>()
}