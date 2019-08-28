package conventions

import misc.MyDate
import misc.nextDay
import java.time.LocalDate

class DateRangeFav(val start: MyDate, val end: MyDate): Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange:DateRangeFav) : Iterator<MyDate> {
    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.end
}

operator fun MyDate.rangeTo(other: MyDate) = DateRangeFav(this, other)

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

/**
 * https://kotlinlang.org/docs/reference/control-flow.html?&_ga=2.72079571.1931028655.1566793557-2000749774.1547829104#for-loops
 */


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    val mydate = MyDate(1992, 5, 1)
    val rangeDate = MyDate(2000, 4, 2)
    val dateRange = DateRangeFav(mydate, current)
    println(dateRange.contains(rangeDate))
}