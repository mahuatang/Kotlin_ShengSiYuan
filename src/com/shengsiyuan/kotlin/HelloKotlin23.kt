package com.shengsiyuan.kotlin

//扩展: extension

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b

    fun substract(a: Int, b: Int) = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main(args: Array<String>) {
    var extensionTest = ExtensionTest()

    println(extensionTest.add(1, 2))
    println(extensionTest.substract(1, 2))
    println(extensionTest.multiply(1, 2))

    println("----------------------")

    myPrint(BB())

    println("--------------------")

    CC().foo(1)
}

//扩展函数的解析是静态的
//表面上看ExtensionTest增加了乘法操作，其实本质上kotlin并没有对该类的结构进行改变。
//可以反编译查看字节码
//1.扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
//2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
//3.调用是由对象声明类型所决定的，而不是由对象的实际类型决定(只针对扩展，不针对实际情况，看示例代码)
//如果扩展类中已有的方法(名字和参数个数完全一样)，那么调用时类中的方法优先考虑

/*open class AA

class BB: AA()

fun AA.a() = "a"
fun BB.a() = "b"*/

open class AA {
    open fun a() = "a"
}

class BB: AA() {
    override fun a() = "b"
}

fun myPrint(aa: AA) {
    println(aa.a())
}

class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo(i: Int) {
    println("member2")
}

fun Any?.toString(): String {
    if(null == this) {
        return "null"
    }

    return toString()
}


