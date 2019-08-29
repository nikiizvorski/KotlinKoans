package collections

import misc.*

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy {
    it.orders.size
}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap {
    it.products
}.maxBy {it.price }

/**
*
* https://play.kotlinlang.org/koans/Collections/Max%20min/Task.kt
*
* Implement Shop.getCustomerWithMaximumNumberOfOrders() and Customer.getMostExpensiveOrderedProduct() using max, min, maxBy, or minBy.
*/

fun main(args: Array<String>) {
    println(shop.getCustomerWithMaximumNumberOfOrders())
    println(customers.get(shop.customers.get(0).name)?.getMostExpensiveOrderedProduct())
}