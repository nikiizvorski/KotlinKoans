package conventions

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

/**
 * Implement the function Invokable.invoke() so it would count a number of invocations.
 */


fun main(args: Array<String>){
    val invokable: Invokable = Invokable()
    println(invokable.invoke().numberOfInvocations)
    println(invokeTwice(invokable).numberOfInvocations)
}