
fun main() {

    //If Condition

    var price=5

    if (price>=10){
        price++
        println(price)
    }
    else if(price<=5){
        price =10
        println(price)
    }
    else{
        price--
        println(price)
    }

    // If Single Line

    var catNum = 3
    if (catNum>=3) println(-catNum) else println(--catNum)

    println("------------------------------------")

    //When Expression

    val user=Users("Mohamed","Alaa")

    when(user.name){

        "Mohamed" -> println("I,m")
        "Alaa" -> println("Friend")
        else -> println("IDK")

    }

    println("------------------------------------")

    when{

        user.name =="Mohamed" && user.friend =="Alaa" -> {
            println("Mohamed Alaa")
        }
        else -> {
            println("Not Friends")
        }

    }

}

class Users(var name:String,var friend:String)