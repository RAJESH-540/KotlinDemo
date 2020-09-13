package com.example.kotlindemo.session6

/**
 * Created by skycap.
 */
// By Default all classes are in kotlin is
// public final
// so we have to make it open
open class Parent(name: String?){

    // default all variables are final
    // se we have to make it open to override this in another child class
    open val nameMember:String=name?:"Test"

    // default all functions are final
    // se we have to make it open to override this in another child class
    open fun getData(){}
}

// : is used for bot extending and implementing
class Child:Parent("New Value"){
    //    init {
//        getData()
//    }
    override fun getData() {
        super.getData()
        print(nameMember)
    }

    override val nameMember: String get() = "New Value"

    // it will make static only this part
    companion object{
        fun getStaticData(){}
    }

}

interface InheritanceExample{
    val name:String
    fun getData()

}

// override variables using primary constructor
class ImplementInterface(override val name: String) :InheritanceExample {
    override fun getData() {
        TODO("Not yet implemented")
    }

}

// override variables using data member
class ImplementInterface1 :InheritanceExample {

    override val name: String ="test"
    override fun getData() {
        TODO("Not yet implemented")
    }

}

abstract class AbstractExample{
    abstract val name:String
    abstract fun fun1()
    fun fun2() {
    }
}

class ImplementAbstract(override val name: String) :AbstractExample(){
    override fun fun1() {
        fun1()
    }
}

// object  make all the data inside
// accessable without creating object instance
object Test{
    // it will work as static
    fun getData(){}
}

class ObjectTestUsage{
    fun getTestFunction(){
        Test.getData()
        Child.getStaticData()
    }
}