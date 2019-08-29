package collections

import misc.Customer
import misc.Shop
import misc.shop

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()

// Return customers who have more than 1 item and delivered orders
fun Shop.getCustomerWhoDeliveredMore(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.products.size > 1 && it.isDelivered }
    delivered.size > undelivered.size
}.toSet()

/**
 *
 * https://kotlinlang.org/docs/reference/multi-declarations.html?_ga=2.7572466.1521765151.1567079927-1117251407.1567079927
 *
 * https://play.kotlinlang.org/koans/Collections/Partition/Task.kt
 *
 * Implement Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered() using partition.
 *
 * Partition basically takes a predicate and uses that to split a collection in a pair of two lists depending on the condition added.
 */

fun main(args: Array<String>) {
    println(shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    println(shop.getCustomerWhoDeliveredMore())
}