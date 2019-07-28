package control.statements.`when`

fun main(){
    println(respondToQuestion());
}

fun respondToQuestion(): String =
    when(val input = doYouUnderstandKotlin()){
        "y", "yes" -> "Yes, I understand Kotlin."
        "n", "no" -> "No, I do not."
        else -> "I don't know yet."
    }

fun doYouUnderstandKotlin(): String = "yes"