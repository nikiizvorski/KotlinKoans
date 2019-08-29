package collections

import misc.*

// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap{ it.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orderedProducts }.toSet()
}

/**
 * https://play.kotlinlang.org/koans/Collections/FlatMap/Task.kt
 *
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/flat-map.html
 *
 * Implement Customer.getOrderedProducts() and Shop.getAllOrderedProducts() using flatMap.
 */

fun main(args: Array<String>) {
    println(orderedProducts)
    println(shop.allOrderedProducts)
}