// 1.导入包
package top.mcablylx.kotlin

fun main(args: Array<String>) {

}

// 2.定义函数
fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b
// Unit 可以看做java里面void  可以省略
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// 3.定义变量
//只读  局部变量
val a: Int = 1
val b = 2
//读写变量
var c = 3
// 4. 注释  这就是注释...

// 5.使用字符串模板
var s = 1
// 模板中的简单名称：
val s1 = "a is $a"

// 模板中的任意表达式：
val s2 = "${s1.replace("is", "was")}, but now is $a"

// 6.使用条件表达式
fun maxOf1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

// 7.使用可空值及 null 检测
fun parseInt(str: String): String? {
    return str
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // 直接使用 `x * y` 会导致编译错误，因为他们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 和 y 会自动转换为非空值（non-nullable）
        println(x.toInt() * y.toInt())
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

// 8.使用类型检测及自动类型转换
fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }
    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` 在这一分支自动转换为 `String`
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    // `obj` 在 `&&` 右边自动转换成 `String` 类型
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

// 9.使用 for 循环
fun forTest() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    for ((index, value) in items.withIndex()) {
        println("$index -> $value")
    }
}

// 10.使用 while 循环
fun whileTest() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

// 11.使用 when 表达式
fun whenTest(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

// 12.使用区间（range）
fun rangeTest() {
    //使用 in 运算符来检测某个数字是否在指定区间内
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    //检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    //区间迭代
    for (x in 1..5) {
        print(x)
    }
    //数列迭代
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

// 13.使用集合   上面例子很多都是使用集合的
// 14.创建基本类及其实例
val aObj = Any() // 不需要“new”关键字