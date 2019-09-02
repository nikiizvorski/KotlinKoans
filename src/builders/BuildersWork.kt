package builders

import builders.Answer.*

enum class Answer { a, b, c }

val answers = mapOf<Int, Answer?>(
        1 to c, 2 to b, 3 to b, 4 to c
)

/**
 * https://play.kotlinlang.org/koans/Builders/Builders%20how%20it%20works/Task.kt
 */


fun main(args: Array<String>){
    println(answers)
}