package basics.data.types

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(){
    var stringArray: Array<String> = arrayOf("john","doe");
    for(str in stringArray){
        println(str)
    }

    var intArray: IntArray = intArrayOf(2,3);
    for(intValue in intArray){
        println(intValue)
    }


    var arrayCreatedUsingConstructor = Array(2,{i -> i*2});
    for (intValue in arrayCreatedUsingConstructor){
        println(intValue)
    }

}