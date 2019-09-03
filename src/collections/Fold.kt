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
 * fold() takes an initial value, and the first invocation of the lambda you pass to it will receive that initial value
 * and the first element of the collection as parameters.
 *
 * reduce() doesn't take an initial value, but instead starts with the first element of
 * the collection as the accumulator (called sum in the following example).
 */
fun smallExamplesFold(){
    val list = listOf(1, 2, 3).fold(0) { sum, element -> sum + element }
    val plist = listOf(1, 2, 3).reduce {sum, element -> sum + element}
    println(list)
    println(plist)
}

/**
 *
 * https://play.kotlinlang.org/koans/Collections/Fold/Task.kt
 *
 * Implement Shop.getSetOfProductsOrderedByEveryCustomer() using fold.
 */

fun main(args: Array<String>) {
    println(shop.getSetOfProductsOrderedByEveryCustomer())
    smallExamplesFold()
}