package builders

fun <K,V> buildMap(build: HashMap<K,V>.() -> Unit): Map<K,V> {
    val map = HashMap<K,V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

/**
 * https://play.kotlinlang.org/koans/Builders/String%20and%20map%20builders/Task.kt
 */


fun main(args: Array<String>){
    println(usage())
}