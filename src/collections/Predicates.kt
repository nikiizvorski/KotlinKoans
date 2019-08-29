package collections

import misc.*

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all{
    it.city == city
}

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any{
    it.city == city
}

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.count {
    it.city == city
}

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find {
    it.city == city
}

/**
 * https://play.kotlinlang.org/koans/Collections/All%20Any%20and%20other%20predicates/Task.kt
 *
 * Implement all the functions below using all, any, count, find.
 * val numbers = listOf(-1, 0, 2)
 * val isZero: (Int) -> Boolean = { it == 0 }
 * numbers.any(isZero) == true
 * numbers.all(isZero) == false
 * numbers.count(isZero) == 1
 * numbers.find { it > 0 } == 2
 * val numbers = listOf(-1, 0, 2)
 * val isZero: (Int) -> Boolean = { it == 0 }
 * numbers.any(isZero) == true
 * numbers.all(isZero) == false
 * numbers.count(isZero) == 1
 * numbers.find { it > 0 } == 2
 */

fun main(args: Array<String>) {
    println(shop.checkAllCustomersAreFrom(Tokyo))
    println(shop.hasCustomerFrom(Tokyo))
    println(shop.countCustomersFrom(Vancouver))
    println(shop.findAnyCustomerFrom(Canberra))
}