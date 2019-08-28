package conventions

import misc.MyDate
import java.sql.Date
import java.time.LocalDate

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