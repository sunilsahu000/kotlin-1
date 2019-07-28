package inkeyword.examples

/*This program is to validate identifiers based on the below mentioned rules
    1. Valid identifier starts with an underscore or an alphabet
    2. Valid identifier can contain only numbers, alphabets and underscore.*/

fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(char: Char): Boolean = char == '_' || char in '0'..'9' || char in 'a'..'z' || char in 'A'..'Z'
    if(s.isEmpty() || s[0] in '0'..'9') return false
    for(ch in s){
        if(!isValidCharacter(ch)) return false;
    }
    return true;
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}