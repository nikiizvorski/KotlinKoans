package collections

import misc.*

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter{ it.isDelivered }.flatMap {it.products}.maxBy{ it.price}
}

//Return the cheapest expensive product among all delivered products
fun Customer.getCheapesDeliveredProduct() : Product? {
    return orders.filter { it.isDelivered }.flatMap { it.products }.minBy { it.price }
}

fun Customer.getMostExpensiveUndeliveredProduct(): Product? {
    return orders.filter { it.isDelivered == false }.flatMap { it.products }.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.getOrderedProductsList() }.count { it == product }
}

fun Customer.getOrderedProductsList(): List<Product> {
    return orders.flatMap {it.products}
}

/**
 * https://play.kotlinlang.org/koans/Collections/Compound%20tasks/Task.kt
 *
 * Implement Customer.getMostExpensiveDeliveredProduct() and Shop.getNumberOfTimesProductWasOrdered() using functions from the Kotlin standard library.
 */

fun main(args: Array<String>) {
    println(shop.customers.get(0).getMostExpensiveDeliveredProduct())
    println(shop.customers.get(0).getOrderedProductsList())
    println(shop.customers.get(0).getCheapesDeliveredProduct())
    println(customers.get("Reka")!!.getMostExpensiveUndeliveredProduct())
}