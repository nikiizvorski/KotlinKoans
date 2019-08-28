import java.util.Arrays.asList

/**
 * https://kotlinlang.org/docs/reference/functions.html?&_ga=2.68211153.1931028655.1566793557-2000749774.1547829104#default-arguments
 */

fun main(args: Array<String>){
    // Given
    val options = asList("n", "b", "c")

    // Then
    println(joinOptions(options))

}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")