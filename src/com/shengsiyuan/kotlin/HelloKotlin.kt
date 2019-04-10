package com.shengsiyuan.kotlin//逻辑不是物理  最佳实践：逻辑和物理一样

/*
fun main(args: Array<String>) {
    println("Hello World")
}*/

fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum2(3, 4))

    myPrint(2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b//类型推断

fun myPrint(a: Int, b: Int) /*: Unit  相当于返回void类型，不返回类型*/{
    println("$a + $b = ${a + b}")//字符串模版
}



