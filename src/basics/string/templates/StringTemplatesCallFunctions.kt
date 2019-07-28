package basics.string.templates

fun returnWorldString(): String{
    return "World";
}

fun main(){
    println("Hello ${returnWorldString()}")
}