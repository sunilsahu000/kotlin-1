package basics.functions

fun addFun(a: Int, b: Int): Int{
    return a + b;
}

fun addFunWithExpressionBody(a: Int, b: Int): Int = a + b;

fun addFunWithLocalFunction(a: Int, b: Int): Int{
    fun checkIfAAndBAreNotNegative(a: Int, b: Int): Boolean{
        return a > 0 && b > 0;
    }
    return if (checkIfAAndBAreNotNegative(a,b)) a + b else 0;
}
fun main(){
    //println(addFun(20,30));
    //println(addFunWithExpressionBody(10, 20));
    println(addFunWithLocalFunction(10,20));
    println(addFunWithLocalFunction(-1,20));
}