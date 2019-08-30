package properties

import misc.MyDate
import misc.toDate
import misc.toMillis
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * https://kotlinlang.org/docs/reference/delegated-properties.html?&_ga=2.208773842.1521765151.1567079927-1117251407.1567079927#property-delegate-requirements
 */

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

fun main(args: Array<String>){
    
}