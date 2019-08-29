package collections

import misc.Customer
import misc.Shop
import misc.customers
import misc.shop

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy {
    it.orders.size
}

/**
 *
 * https://play.kotlinlang.org/koans/Collections/Sort/Task.kt
 *
 * Implement Shop.getCustomersSortedByNumberOfOrders() using sorted or sortedBy.
 */

fun main(args: Array<String>) {
    println(shop.getCustomersSortedByNumberOfOrders())
}