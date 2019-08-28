package introduction

import kotlin.math.exp


/**
 * https://kotlinlang.org/docs/reference/typecasts.html?&_ga=2.73078995.1931028655.1566793557-2000749774.1547829104#smart-casts
 */

fun main(args: Array<String>){
    val num: Expr = Num(10)
    val sum: Expr = Sum(Num(5), Num(6))
    val err: Expr = Sum(Num(-1), Num(6))
    println(eval(num))
    println(eval(sum))
    println(eval(err))
}

fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr