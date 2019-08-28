package conventions

import misc.MyDate
import java.time.LocalDate

class DateRangeNew(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRangeNew(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

/**
 * https://kotlinlang.org/docs/reference/ranges.html?_ga=2.98122335.1931028655.1566793557-2000749774.1547829104
 */


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    val mydate = MyDate(1992, 5, 1)
    val rangeDate = MyDate(2000, 4, 2)
    val dateRange = DateRangeNew(mydate, current)
    println(dateRange.contains(rangeDate))
    println(checkInRangeNew(rangeDate, mydate, current))
}