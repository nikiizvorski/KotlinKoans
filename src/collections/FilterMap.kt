package collections

import misc.*

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map {
    it.city
}.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter{
    it.city == city
}

/**
 * https://play.kotlinlang.org/koans/Collections/Filter%20map/Task.kt
 */

fun main(args: Array<String>) {
    println(shop.getCitiesCustomersAreFrom())
    println(shop.getCustomersFrom(Canberra))
}