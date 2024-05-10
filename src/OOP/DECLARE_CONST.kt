const val USER_JOB = "UI"

fun main() {

    val obj = Info("Mohamed", "Mansour")
    println("${obj.name}-${obj.last}")
    println(Info.MAX_AGE)
    println(USER_JOB)
}

class Info(val name: String, val last: String) {
    companion object {
        const val MAX_AGE = 30
    }
}