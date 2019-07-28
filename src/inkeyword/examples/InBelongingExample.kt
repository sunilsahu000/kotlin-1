package inkeyword.examples

fun main(){
    println(checkIfCharIsAnAlphabet('F'))
}

fun checkIfCharIsAnAlphabet(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

