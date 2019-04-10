package com.shengsiyuan.kotlin

//可见性 vidibility
//Kotlin提供了4种可见性修饰符：private，protected，internal，public
//internal在同一个模块中可以使用
//protected不能用在顶层实体当中
//private只能在当前文件中使用

fun method() {

}


/*****************在类里面使用******************/
/**
 * 如果是private的，只能在类里面使用
 * protected，可以在当前类和子类中使用
 * internal:在模块中如果能调用，就能够使用
 * public：任何地方都可以使用
 */

open class Clazz {
    private val b = 3;
    protected open val c = 4;
    internal val d = 5;
}

class subClazz: Clazz() {
    //都可以用
}

class Clazz2 {
    //只能用internal
}
