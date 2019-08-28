package introduction

import java.util.*


/**
 * https://kotlinlang.org/docs/reference/object-declarations.html?_ga=2.268514609.1931028655.1566793557-2000749774.1547829104
 */

/**
 * Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class.
 * In Kotlin you use Kotlin library extensions instead of java.util.Collections,
 * but this example is still a good demonstration of mixing Kotlin and Java code.
 */
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}

fun main(args: Array<String>){
    val list = getList()
    println(list)
}

