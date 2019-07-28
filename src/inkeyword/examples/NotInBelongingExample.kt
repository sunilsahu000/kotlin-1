package inkeyword.examples

fun main(){
    println(checkCharacterIsNotADigit('3'))
}

fun checkCharacterIsNotADigit(char: Char) = char !in '0'..'9'