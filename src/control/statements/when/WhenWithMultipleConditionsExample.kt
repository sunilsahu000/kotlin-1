package control.statements.`when`

fun main(){
    println("Do you understand when with multiple conditions? ${doYouAgree("yes")}")
}

fun doYouAgree(input: String): String{
    return when(input){
        "y", "yes" -> "Yes, I agree!"
        "n", "no" -> "No, I do not agree"
        else -> "I do not understand"
    }
}