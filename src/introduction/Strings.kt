package introduction

/**
 * https://kotlinlang.org/docs/reference/basic-types.html?&_ga=2.67164625.1931028655.1566793557-2000749774.1547829104#string-literals
 */

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun main(args: Array<String>){
    println(getPattern())
}

/**
 * Raw strings are useful for writing regex patterns, you don't need to escape a backslash by a backslash.
 * Below there is a pattern that matches a date in format 13.06.1992 (two digits, a dot, two digits, a dot, four digits):
 * fun introduction.getPattern() = """\d{2}\.\d{2}\.\d{4}"""
 * Using introduction.getMonth variable rewrite this pattern in such a way that it matches the date in format
 * 13 JUN 1992 (two digits, a whitespace, a introduction.getMonth abbreviation, a whitespace, four digits).
 */
fun getPattern(): String = """\d{2} $month \d{4}"""