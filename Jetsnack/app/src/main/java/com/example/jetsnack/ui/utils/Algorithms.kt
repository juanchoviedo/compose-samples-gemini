package com.example.jetsnack.ui.utils

fun describe(obj: Any?){
    if (obj is String){
        println("String of length " + obj.length)
    }
    else if (obj is Int){
        println("Integer of value " + obj.toInt().toString())
        }
    else {
        println("Unknown type")
    }
}

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    }
    return n * factorial(n - 1)
}