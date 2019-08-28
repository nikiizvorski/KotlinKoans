package introduction

import java.util.*


/**
 * https://kotlinlang.org/docs/reference/extensions.html?_ga=2.1315313.1931028655.1566793557-2000749774.1547829104
 */

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main(args: Array<String>){
    val r = 5.r()
    var b = Pair(5,10).r()
    println(r)
    println(b)
}

