package collections

import misc.*

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap { it.orders.flatMap { it.products }}.toSet()
    return customers.fold(allProducts, {
        orderedByAll, customer ->
        orderedByAll.intersect(customer.orders.flatMap { it.products }.toSet())
    })
}

/**
 *
 * https://play.kotlinlang.org/koans/Collections/Fold/Task.kt
 *
 * Implement Shop.getSetOfProductsOrderedByEveryCustomer() using fold.
 */

fun main(args: Array<String>) {
    println(shop.getSetOfProductsOrderedByEveryCustomer())
}