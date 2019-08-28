package conventions

import misc.MyDate
import java.time.LocalDate

/**
 * Is it a leap?
 */
fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}

/**
 * https://kotlinlang.org/docs/reference/multi-declarations.html?_ga=2.105060547.1931028655.1566793557-2000749774.1547829104
 */


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    println(isLeapDay(current))
}