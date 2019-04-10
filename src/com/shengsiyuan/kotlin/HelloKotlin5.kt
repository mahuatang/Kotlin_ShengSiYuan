package com.shengsiyuan.kotlin

fun main(args: Array<String>) {
    println(convert2Uppercase("hello world"))
    println(convert2Uppercase(23))
}

fun convert2Uppercase(str: Any): String? {//Any相当于Java中的Object
    if(str is String) {//is相当于Java中的instanceOf
        return str.toUpperCase();
    }

    return null
    /*Java的实现
    if(str instanceOf String) {
        String str2 = (String)str;
        return str2.toUpperCase();
    }*/
}