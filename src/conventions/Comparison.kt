package conventions

import java.sql.Date
import java.time.LocalDate

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

/**
 * https://kotlinlang.org/docs/reference/operator-overloading.html?_ga=2.97718623.1931028655.1566793557-2000749774.1547829104
 */


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    val mydate = MyDate(1992, 5, 1)
    val compare = mydate.compareTo(current)
    println(mydate)
    println(current)
    println(compare)
}