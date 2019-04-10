package com.shengsiyuan.kotlin2

/**
 * 密封类（sealed class）
 * 1.密封类表示一种受限的层次结构，所属的类型是受限的，可以认为是枚举的一种扩展；
 * 2.密封类是可以有子类，子类可以创建无数个实例；
 * 3.在1.1中密封类的子类必须定义在密封类的内部，1.1之后子类只要和密封类在同一个文件中即可；密封类的间接子类可以定义在任何地方
 * 4.密封类本身是一个抽象的类，里面可以包含抽象的成员，密封类不允许提供非私有的构造方法。
 *
 */

sealed class Calculator

class Add: Calculator()

class Subtract: Calculator()

class Multiply: Calculator()

fun calculate(a: Int, b: Int, cal: Calculator) = when(cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
    println(calculate(1, 2, Multiply()))
}


