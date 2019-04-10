package com.shengsiyuan.kotlin

//import com.shengsiyuan.kotlin2.multiply
import com.shengsiyuan.kotlin2.multiply as myMultiply
fun main(args: Array<String>) {
    val a: Int = 1//val相当于final
    val b = 2//类型推断认为是int值

    var c: Int//var是变量
    c = 3

    var d = 3
    d = 4

    println(d)

    /*
    * /**/ 注释可以嵌套
    * */
    var x = 10
    var y: Byte = 20

    x = y.toInt() //没有小类型赋值给大类型一说， 类型必须一致

    println(x)

    println(myMultiply(2, 3))

    val m = intArrayOf(1, 2, 3)//表示一个常引用，引用的对象不能改变，但是对象的值可以改变
//    m = intArrayOf(4, 5)
    m.set(0, 4)

    for (item in m) {
        println(item)
    }
}