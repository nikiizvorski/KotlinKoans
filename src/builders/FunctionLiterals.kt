package builders

/**
 * https://kotlinlang.org/docs/reference/lambdas.html?&_ga=2.154315384.1521765151.1567079927-1117251407.1567079927#function-literals-with-receiver
 */

fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}

fun main(args: Array<String>){
    println(task())
}