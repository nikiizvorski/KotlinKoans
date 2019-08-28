package introduction

data class Person(val name: String, val age: Int)

/**
 * https://kotlinlang.org/docs/reference/classes.html?_ga=2.144233973.1931028655.1566793557-2000749774.1547829104
 */

fun main(args: Array<String>){
    for (person in getPeople()) println(person.name)
}


fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}