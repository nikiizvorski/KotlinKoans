package collections

import misc.*

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy{
    it.city
}

/**
 *
 * https://play.kotlinlang.org/koans/Collections/GroupBy/Task.kt
 *
 * Implement Shop.groupCustomersByCity() using groupBy.
 */

fun main(args: Array<String>) {
    println(shop.groupCustomersByCity())
}