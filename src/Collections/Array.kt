

fun main() {

    val items = arrayOf(3,4,6,3,'A',"Mo",9)
    items.forEach { println(it) }

    println("-----------------------")

    val items1 = intArrayOf(0,1,2,3,4)
    items1.forEach { println(it) }

    println("-----------------------")

    val items2 = arrayOf(
        newUsers("Mohamed","Sayed"),
        newUsers("Ahmed","Omar"),
        newUsers("Eman","Ramy"),
    )
    items2.forEach { println(it) }

    println("-----------------------")

    items2[0]=newUsers("Update","ME")
    items2.forEach { println(it) }

}

class newUsers(firstName:String,lastName:String){
    var fullName :String =firstName + lastName
    override fun toString(): String {
        return fullName
    }

}