package com.callKotlinInJava.models

class kotlin(var name: String, cst: java) {

    init {
        val test = cst.customer("data")
    }

    fun printInfo() {
        println(name)
    }
}