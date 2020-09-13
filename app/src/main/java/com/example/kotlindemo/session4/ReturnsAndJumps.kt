package com.example.kotlindemo.session4

/**
 * Created by skycap.
 */
fun main() {
    // it will terminate outer loop if condition met
    // labled loop
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println("i value is $i")
            println("j value is $j")
            if (j==3) break@loop
        }
    }

    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print(it)
    }

}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}