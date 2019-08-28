package introduction

import java.util.*

/**
 * https://kotlinlang.org/docs/reference/lambdas.html?_ga=2.75698645.1931028655.1566793557-2000749774.1547829104
 */

fun main(args: Array<String>){
    val options = Arrays.asList(1, 2, 3, 4, 5)

    println(containsEven(options))
}


/**
 * Contain any even in the collection passed
 */
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }