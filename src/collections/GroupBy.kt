package collections

import misc.*

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy{
    it.city
}

// Return a map of the customers with highest orders number and sorted ASC
fun Shop.getCustomerByOrdersNumber(): Map<Int, List<Customer>> = customers.groupBy {
    it.orders.size
}.toSortedMap()

// Return a map of the customers with highest orders number and sorted DESC
fun Shop.getCustomerByOrdersNumberDesc(): Map<Int, List<Customer>> = customers.groupBy {
    it.orders.size
}.toSortedMap(reverseOrder())

/**
 *
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.comparisons/index.html
 *
 * https://play.kotlinlang.org/koans/Collections/GroupBy/Task.kt
 *
 * Implement Shop.groupCustomersByCity() using groupBy.
 */

fun main(args: Array<String>) {
    println(shop.groupCustomersByCity())
    println(shop.getCustomerByOrdersNumber())
    println(shop.getCustomerByOrdersNumberDesc())
}