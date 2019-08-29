package collections

import misc.Customer
import misc.Shop
import misc.shop

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it.isDelivered }
    undelivered.size > delivered.size
}.toSet()

/**
 *
 * https://kotlinlang.org/docs/reference/multi-declarations.html?_ga=2.7572466.1521765151.1567079927-1117251407.1567079927
 *
 * https://play.kotlinlang.org/koans/Collections/Partition/Task.kt
 *
 * Implement Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered() using partition.
 */

fun main(args: Array<String>) {
    println(shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
}