@file:JvmName("DefaultValuedFunctionKotlinMainFile")
package basics.functions.defaultarguments

@JvmOverloads
fun defaultValuedFunctionToRepeatCharacters(char: Char = '*', count: Int = 10){
    repeat(count){
        print(char);
    }
    println();
}