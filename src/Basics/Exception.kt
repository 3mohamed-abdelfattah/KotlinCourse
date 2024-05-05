package Basics

import kotlin.Exception


fun main() {

    // Try Catch

    val createNew =User("Mohamed",8)
    try {
        CheckUser(createNew)
        println("Well")
    }catch (ex:Exception){
        println("Exception Catch!!")
    }finally {
        println("Must Shown : )")
    }
}


 fun CheckUser(p:User){
    if (p.age <10) throw Exception("Error")
}

//Create Exception
class myException( name:String,massage:String): Exception("Invalid Name :$name ,$massage")

data class User(val name1: String, val age: Int)