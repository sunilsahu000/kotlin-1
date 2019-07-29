package basics.data.types.type.conversion

fun main(){
    var int: Int = 3000;
    var doubleVal: Double = int.toDouble()
    doubleVal = 343.234
    var intFromDouble: Int = doubleVal.toInt()
    println(int)
    println(doubleVal)
    println(intFromDouble)

}
