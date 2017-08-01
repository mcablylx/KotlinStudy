package top.mcablylx.kotlin
//参数第一个为Double, 第二个是变长参数, 第三个是默认参数
fun hello(double: Double, vararg ints:Int, string:String = "NMB",test:Long = 9L){
    println(double)
    ints.forEach(::println)
    println(string)
}

fun main(args: Array<String>) {
    val double = 3.0
    val string = "CCC"
    val ints = intArrayOf(1,2,6,3,4,5)
    //第一种调用方式   变长参数后面的用具名参数.变长参数就不用写在最后一位了.跟java的区别
    hello(double,1,2,3,4,5,string = string,test = 0L)
    //第二种 变长参数可用 数组前面加*来 替换.  *目前只支持数组,不支持list *代表将数组展开
    hello(double,*ints)
}