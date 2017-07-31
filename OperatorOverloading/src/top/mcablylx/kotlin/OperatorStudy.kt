package top.mcablylx.kotlin

class Point(val x: Int, val y: Int) {
    override fun toString(): String {
        return "Point(${this.x},${this.y})"
    }

    /**
     * 重载
    a + b	a.plus(b)
    a - b	a.minus(b)
    a * b	a.times(b)
    a / b	a.div(b)
    a % b	a.rem(b)、 a.mod(b) （已弃用）
    a..b	a.rangeTo(b)

    a in b	b.contains(a)
    a !in b	!b.contains(a)

    a[i]	a.get(i)
    a[i, j]	a.get(i, j)
    a[i_1, ……, i_n]	a.get(i_1, ……, i_n)
    a[i] = b	a.set(i, b)
    a[i, j] = b	a.set(i, j, b)
    a[i_1, ……, i_n] = b	a.set(i_1, ……, i_n, b)

    a()	a.invoke()
    a(i)	a.invoke(i)
    a(i, j)	a.invoke(i, j)
    a(i_1, ……, i_n)	a.invoke(i_1, ……, i_n)

    a += b	a.plusAssign(b)
    a -= b	a.minusAssign(b)
    a *= b	a.timesAssign(b)
    a /= b	a.divAssign(b)
    a %= b	a.modAssign(b)

    a == b	a?.equals(b) ?: (b === null)
    a != b	!(a?.equals(b) ?: (b === null))

    a > b	a.compareTo(b) > 0
    a < b	a.compareTo(b) < 0
    a >= b	a.compareTo(b) >= 0
    a <= b	a.compareTo(b) <= 0
     */

    // example: '+'
    operator fun plus(point2: Point): Point {
        return Point(this.x + point2.x, this.y + point2.y)
    }

    operator fun invoke(): Point {
        return Point(this.x + 4, this.y + 5)
    }

}

fun main(args: Array<String>) {
    val point1 = Point(1, 2)
    val point2 = Point(1, 2)
    val point3 = point1 + point2
    println(point3)
    val point4: Point = Point(4, 5)
    println(point4())
}

