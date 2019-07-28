package exceptions

fun main(){
    val number: Int = 104
    val percentage = if( number in 0..100) number
        else throw IllegalArgumentException("Percentage values have to be between 0 and 100: $number")
    println("After logic")
    /*println("Percentage $percentage")*/
}