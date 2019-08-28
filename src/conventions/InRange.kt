package conventions

import java.time.LocalDate

/**
 * https://kotlinlang.org/docs/reference/ranges.html?_ga=2.98122335.1931028655.1566793557-2000749774.1547829104
 */

class DateRange(val start: MyDate, val endInclusive: MyDate){
    operator fun contains(item: MyDate): Boolean = item in start..endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    val mydate = MyDate(1992, 5, 1)
    val rangeDate = MyDate(2000, 4, 2)
    val compare = mydate.compareTo(current)
    val dateRange = DateRange(mydate, current)
    println(dateRange.contains(rangeDate))
    println(checkInRange(rangeDate, mydate, current))
}