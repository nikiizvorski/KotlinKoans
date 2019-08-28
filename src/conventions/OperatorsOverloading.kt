package conventions

import misc.MyDate
import misc.TimeInterval
import misc.addTimeIntervals
import java.time.LocalDate

operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + misc.TimeInterval.DAY * 5
}

/**
 * https://kotlinlang.org/docs/reference/ranges.html?_ga=2.98122335.1931028655.1566793557-2000749774.1547829104
 */


fun main(args: Array<String>){
    val current = MyDate(LocalDate.now().year, LocalDate.now().month.value, LocalDate.now().dayOfMonth)
    println(task1(current))
    println(task2(current))
}