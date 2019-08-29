package collections

import misc.*

// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.flatMap { it.products }.sumByDouble{
    it.price
}

/**
 *
 * https://play.kotlinlang.org/koans/Collections/Sum/Task.kt
 *
 * Implement Customer.getTotalOrderPrice() using sum or sumBy.
 */

fun main(args: Array<String>) {
    println(shop.customers.get(0).getTotalOrderPrice())
}