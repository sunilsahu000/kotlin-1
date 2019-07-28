package inkeyword.examples

fun main(){
    println(recogniseCharacter('$'))
}

fun recogniseCharacter(char: Char): String = when(char) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z' -> "Lower case alphabet"
    in 'A'..'Z' -> "Upper case alphabet"
    else -> "I don't know"
}