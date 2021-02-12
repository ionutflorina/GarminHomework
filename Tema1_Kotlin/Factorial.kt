package com.example.tema1

fun factorial(num: Long): Long {
    var fact: Long = 1
    for (i in 1..num) {
        fact *= i
    }
    return fact
}
