package com.example.kotlindemo.session5

import android.widget.TextView

/**
 * Created by skycap.
 */
interface IntPredicate {
    fun accept(i: Int): Boolean
}



class ImplementInterface : IntPredicate{

    override fun accept(i: Int): Boolean {
        TODO("Not yet implemented")
    }

    val data=object :IntPredicate{
        override fun accept(i: Int): Boolean {
        return false
        }
    }
}

fun main() {

}