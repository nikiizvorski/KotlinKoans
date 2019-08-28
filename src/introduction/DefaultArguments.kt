package introduction

/**
 * https://kotlinlang.org/docs/reference/functions.html?&_ga=2.109778245.1931028655.1566793557-2000749774.1547829104#default-arguments
 */

fun main(args: Array<String>){
    println(useFoo())

}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)