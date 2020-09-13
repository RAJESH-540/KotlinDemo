package com.example.kotlindemo.session3

/**
 * Created by skycap.
 */
fun main() {
    // Traditional usage
    val a:Int=10
    val b:Int=20
    var max:Int

    // if without block in case both condition have single line beneath
    if (a < b) max = b
    else print("else")

    // signle line with variable and also assigning values according to condition
    var max2= if(a > b) a else b
    print(if(a > b) a else b)

    // variable and also assigning values according to condition with blocks
    val max3 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    // when block assigning value to variable
    var max4=when(a>b){
        true->{
            print("test")
            a
        }
        false->b
    }

    // when block with else statement
    var x=10
    when(x){
        1,3-> print("1")
        2,5-> print("test")
        else -> print("else")
    }
    // when block you can change conditional check
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        "10".toInt() -> print("conversion")
        else -> print("otherwise")
    }

    when (x) {
        in 1..10 -> print("x is in the range")
//        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    fun hasPrefix(x: Any) =  when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    fun hasPrefic(x:Any):Boolean{
        return if(x is String) {
            x.startsWith("prefix")
        } else false
    }




}