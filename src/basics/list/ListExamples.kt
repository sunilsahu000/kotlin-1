package basics.list

fun main(){
    val mutableListEx = mutableListOf("Kotlin");
    mutableListEx.add("Java");
    println(mutableListEx)

    val immutableListEx = listOf("Kotlin");
    //immutableListEx.add("Java");
    /*the above commented line will not compile because listOf gives an immutable list.
        Val in Kotlin is similar to final in Java; its value cannot be changed if its a primitive type.
    However, if its an object, the state of the object can be changed.
    A val variable cannot be made to point to a different object.*/

}