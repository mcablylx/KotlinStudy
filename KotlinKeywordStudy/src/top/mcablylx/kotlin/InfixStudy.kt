package top.mcablylx.kotlin

/**
 * 成员函数或扩展函数
 * 只有一个参数
 * 用 infix 关键字标注
 */
infix fun Point.add(point: Point): Point {
    return Point(this.x + point.x, this.y + point.y)//Point声明在OperatorStudy.kt中
}

fun main(args: Array<String>) {
    val point1 = Point(1, 2)
    val point2 = Point(2, 3)
    //两种用法
    println(point1 add point2)
    println(point1.add(point2))
}