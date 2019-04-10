package com.shengsiyuan.kotlin2

//泛型（generics），表示变量类型的参数化
//程序抄的应该没问题

class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {
  //  var myGeneric: MyGeneric<String> = MyGeneric<String>("helloworld")

    var myGeneric = MyGeneric("helloworld")//类型推断出是String类型的

    println(myGeneric.variable)

    println("-----------------")

    var myClass = MyClass<String, Number>("abc", 2.2)
    myTest(myClass)
}

//泛型的协变（covariant）与逆变（controvariant）

class MyClass<out T,in M>(t: T, m: M) {
    private var t: T

    private var m: M

    init  {
        this.t = t
        this.m = m
    }

    fun get(): T = this.t
    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    var myObject: MyClass<Any, Int> = myClass
    println(myObject.get())

}

/**
 * 关于协变（只能读取）与逆变（只能写入）的概念及来源
 *
 * List<Object>
 * List<String>
 *
 * List<String> list = new ArrayList();
 * List<Object> list2 = list;//编译失败
 *
 * list2.add(new Date())
 *
 * String str = list.get(0);
 *
 * List<? extends Object> list ...
 *
 * interface Collection<E> {
 *  void addAll(Collection<E> items);//（1）
 * }
 *
 * interface Collection<E> {
 *  void addAll(Collection<? extends E> items);//（2）
 * }
 *
 * void copyAll(Collection<Object> to, Collections<String> from) {
 *      to.addAll(from);//（1）会编译报错，from并不是to的子类,改成上面的类型（2）后编译才会正确，然后所有的String都会被当作Object类型看待
 * }
 *
 * Collections<String>就是Collection<? extends Object>的子类型，而不是Collection<String>的子类型
 *
 * 限定了上界
 *
 * List<? super String> 逆变
 *
 * 协变是读取，逆变是写入
 *
 * 我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者；如果只向里面写入数据，而不从中读取数据，那么这样的数据叫做消费者。
 *
 * 生产者使用？ extends E: 消费者使用 ? super E
 *
 *
 */




