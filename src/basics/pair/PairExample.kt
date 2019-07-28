package basics.pair

fun main(){
    val degrees: Int = 10;
    val(description: String, color: basics.pair.Color ) = when {
        degrees < 5 -> Pair("cold",Color.BLUE)
        degrees < 23 -> Pair("mild", Color.GREEN)
        else -> Pair("hot", Color.RED)
    }
    println("The weather is $description, denoted by color ${color.name}")
}