class UserCon(val first: String,val last: String,val boolean: Boolean){

    constructor(first: String,last: String):this(first,last,false){
        println("Dd")
    }

    fun printTxt(){
        println(first + last+boolean)
    }
}

fun main() {
    val user = UserCon("Hi", "Mohamed",false)
    println(user.first)
    user.printTxt()
}