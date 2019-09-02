package generics

fun <T, C: MutableCollection<T>> Collection<T>.partitionTo(first: C, second: C, predicate: (T) -> Boolean): Pair<C, C> {
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

fun <T, C: MutableCollection<T>> Collection<T>.departitioTo(first: C, second: C, predicate: (T) -> Boolean): Pair<C, C> {
    for (element in this) {
        if(predicate(element)){
            first.remove(element)
        } else {
            second.remove(element)
        }
    }
    return Pair(first, second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    println(words)
    lines == listOf("a b", "d e")
    println(lines)
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    println(letters)
    other == setOf('%', '}')
    println(other)
}

/**
 * https://play.kotlinlang.org/koans/Builders/Builders%20how%20it%20works/Task.kt
 */


fun main(args: Array<String>){
    partitionLettersAndOtherSymbols()
    partitionWordsAndLines()
}