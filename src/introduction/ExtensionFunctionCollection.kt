package introduction


fun getListDesc(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}

/**
 * https://blog.jetbrains.com/kotlin/2012/09/kotlin-m3-is-out/?_ga=2.101971521.1931028655.1566793557-2000749774.1547829104#Collections
 */


fun main(args: Array<String>){
    val list = getListDesc()
    println(list)
}