package com.example.kotlindemo.session1

import android.os.Bundle

/**
 * Created by skycap.
 */
fun main() {
    // Non null type - Implicit type cast
    var name = "Sachin"

    // null type - Implicit type cast
    var name2: String? = null

    // reassigned var value
    name = "sachin"

    // assigning null value
    name2 = null

    // init value using lazy.. assign value in run time not in compile time
    // only val can be used in this
    // cannot assign another value
    val rollNo: Int by lazy { 10 }

    // It cannot use data type like: String,Int etc
    // Can hold data other than that
    // cannot hold null values
    // another value can be assign
    lateinit var phone: Bundle

//    phone=Bundle()

    // calling function with null variable


    // useful methods for conversion
//    print(rollNo.toString())
    //  handling null safety with let block
    name2?.let {
        callFunctionNonNull(it)
    }
    // check if variables in null return from here
    callFunctionNonNull(name2 ?: return)

    // check if variable is nul assign a value
    callFunctionNonNull(name2 ?: "new value")

    // getter
    val getterAndSetter = GetterAndSetter()
    getterAndSetter.data=""

}

// Demonstrate how we access variables using null safety
// A function that needs non null string type and return parameter value
//fun callFunctionNonNull(message: String): String {
//    print(message)
//    return message
//}

// function can accept null value ana return null as well
fun callFunctionNonNull(message: String?): String? {
    print(message)
    return null
}

class GetterAndSetter{
    var data: String = ""
        // getter
        get() = "New"
        //setter
    set(value) {field=value+1.toString()}
}