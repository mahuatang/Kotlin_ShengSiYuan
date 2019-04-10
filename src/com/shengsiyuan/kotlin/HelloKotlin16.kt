package com.shengsiyuan.kotlin

open class Myparent {
    open val name: String = "parent"
}

class MyChild: Myparent() {
    override val name: String = "child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)

    println("---------------------")

    var myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)
}

class MyChild2(override val name: String): Myparent() {

}

/**
 * 1.val可以override val
 * 2.var可以override val
 * 3.val无法override var
 *
 * 本质上， val相当于get方法，var相当于get与set方法
 */
open class MyParent3 {
    open fun  method() {
        println("patent method")
    }

    open val name: String get() = "parent"
}

class MyChild3: MyParent3() {
    override fun method() {
        super.method()

        println("child method")
    }

    override val name: String
        get() = super.name + " and child"
}