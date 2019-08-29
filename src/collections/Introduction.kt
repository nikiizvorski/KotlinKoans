package collections

import misc.Customer
import misc.Shop
import misc.customers
import misc.shop


/**
 * https://github.com/goldmansachs/gs-collections-kata
 */
fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()

fun main(args: Array<String>) {
    println(customers)
    println(shop.getSetOfCustomers())
}