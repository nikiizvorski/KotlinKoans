package properties

/**
 * https://play.kotlinlang.org/koans/Properties/Lazy%20property/Task.kt
 */

class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if(value == null) {
                value = initializer()
            }
            return value!!
        }
}

private fun initializer(): () -> Int {
    return { 5 }
}

fun main(args: Array<String>){
    var lazyProperty: LazyProperty = LazyProperty(initializer())
    println(lazyProperty.lazy)
}
