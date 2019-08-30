package properties

/**
 * https://kotlinlang.org/docs/reference/delegated-properties.html?_ga=2.175279458.1521765151.1567079927-1117251407.1567079927
 */

class LazyPropertyByLazy(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

private fun initializer(): () -> Int {
    return { 5 }
}

fun main(args: Array<String>){
    var lazyProperty: LazyProperty = LazyProperty(initializer())
    println(lazyProperty.lazy)
}