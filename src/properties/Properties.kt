package properties

import kotlin.math.absoluteValue

/**
 * https://kotlinlang.org/docs/reference/properties.html?&_ga=2.250709830.1521765151.1567079927-1117251407.1567079927#properties-and-fields
 */

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v: Int?) {
            field = v
            counter++
        }
}

fun main(args: Array<String>){
    var propertyExample: PropertyExample = PropertyExample()
    propertyExample.propertyWithCounter = 2
    println(propertyExample.counter)
}
