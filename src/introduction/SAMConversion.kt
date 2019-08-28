package introduction

import java.util.*


/**
 * https://kotlinlang.org/docs/reference/java-interop.html?&_ga=2.39591139.1931028655.1566793557-2000749774.1547829104#sam-conversions
 */

/**
 * When an object implements a SAM interface (one with a Single Abstract Method), you can pass a lambda instead.
 *  Read more about SAM-conversions.
 */
fun getSamList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x,y -> y - x})
    return arrayList
}

fun main(args: Array<String>){
    val list = getSamList()
    println(list)
}