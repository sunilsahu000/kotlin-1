package basics.variables

fun main(){
    println(listOf("a","b","c").joinToString(separator = "", postfix = ")", prefix = "("));
}