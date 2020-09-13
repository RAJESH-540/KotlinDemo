package com.example.kotlindemo.session5

/**
 * Created by skycap.
 */
// class with default constructor
//class ClassExample ()

// class with parametrized constructor
//class ClassExample (name:String)

// class with primary and secondary constructor
// it can have multiple secondary constructor

class ClassExample(name: String) {
    constructor(otherName: Int) : this(otherName.toString())
    constructor(otherName: Boolean) : this(otherName.toString())
}

// if we use this type of parameters in class
// parameter can be accessed by outer most scope of the class
// and inside init block
class ClassExample1(name: String) {
    val nameCollector = name

    // it will be called first time even after secondary constructor
    // It's optional
    init {
        // here we can access
        name
    }
    constructor(otherName: Int) : this(otherName.toString())



    fun getData() {
        // we're not able to access name variable
//        name
    }

}


// if we use this type of parameters in class
// parameter can be accessed from anywhere in this class
 class ClassExample2(private val name: String) {
    fun getData() {
        name
    }
}

fun main(args: Array<String>) {
    // call the secondary constructor
    ClassExample(10)

    // call the primary constructor
    ClassExample("Sachin")
}