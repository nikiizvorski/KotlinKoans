/**
 * https://kotlinlang.org/docs/reference/null-safety.html?_ga=2.72079571.1931028655.1566793557-2000749774.1547829104
 */

fun main(args: Array<String>){
    val personalInfo: PersonalInfo? = PersonalInfo("nikiizvorski@gmail.com")
    val client: Client? = Client(personalInfo)
   sendMessageToClient(client, "Message to be send", mailer = NullableType())

}

class NullableType : Mailer {
    override fun sendMessage(email: String, message: String) {
        println("send prepared")
    }
}

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
        println("send done")
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}