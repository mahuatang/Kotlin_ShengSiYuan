package com.shengsiyuan.kotlin

fun main(args: Array<String>) {
    println(convert2Int("ab"))
    printMultiply("2", "3")
    printMultiply("2", "a")
    printMultiply2("3", "4")
}

fun convert2Int(str: String): Int? {//Int?表示可能会返回整型，也可能会返回null
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}
/*
* 下面2个例子将可以看出Kotlin编译器比Java编译器更加智能
* */
fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)

    if (null != a2Int && null != b2Int) {//知道2者不为空之后编译器就能自动推断出是整型
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    val a2Int = convert2Int(a)//是Int？类型
    var b2Int = convert2Int(b)
//  println(a2Int * b2Int)  这样会报错
    if(null == a2Int) {
        println("param not int")
    } else if (null == b2Int) {
        println("param not int")
    } else {//知道2者不为空之后编译器就能自动推断出是整型
        println(a2Int * b2Int)
    }
}