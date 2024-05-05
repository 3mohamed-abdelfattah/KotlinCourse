package Basics

typealias AuthToken = String
fun main() {
    val user= UserToken("Mohamed","43msa3odo2edc320dlq2ek-20")
    UserAuth("kf5oo4awd2rf0f99pjf")
}

data class UserToken(val name: String, val token: AuthToken)
data class UserAuth(val token: AuthToken)
data class AdminToken(val password: String, val token: AuthToken)
