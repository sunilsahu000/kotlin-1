package exceptions

import java.lang.NumberFormatException

fun main(){
    val number = try{
        Integer.parseInt("abcd")
    }catch (e: NumberFormatException) {
        null
    }
    println(number)
}