package com.example.kotlindemo.session2

/**
 * Created by skycap.
 */
fun main() {
    // static array and init both
    // adding values as well
    val arrayOInts= intArrayOf(1,2,3,4)
//    print(arrayOInts)

    //static array with size, we're not adding values here
    var array2=IntArray(5)
    // now adding values
    array2[0]=1
    array2[1]=1

    // staic array use block to init values using looping with index
    val array3=IntArray(5){it*1}

    // static array with any type, can be generic based
    val array= arrayOf<String>("sachin","test")

    printAllArrayElements(array3)

    // Dynamic Array

    val dynamicArray=ArrayList<String>()
    // adding values hence it will increase array size
    dynamicArray.add("TEST")


    val name="Sachin"
    val name2="Rajesh"
    // String conact

    print("$name $name2 ${System.currentTimeMillis()}")

//    printAllArrayElements(arrayOInts)
//
//    printAllArrayElements(array2)


}

fun printAllArrayElements(array: IntArray){
    array.forEach {
        print(it)
    }
    array.forEachIndexed { index, value ->  }
}