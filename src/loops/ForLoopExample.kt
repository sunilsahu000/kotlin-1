package loops

fun main(){
    val list = listOf("one","two","three")
    println("normal for loop in Kotlin with 'in' and without type specification - start")
    for(s in list){
        println(s)
    }
    println("normal for loop in Kotlin with 'in' and without type specification - end")

    println("for loop in Kotlin iteration with index - start")
    for((index,s) in list.withIndex()){
        println("Element at index: $index is $s")
    }
    println("for loop in Kotlin iteration with index - end")

    val map = mapOf<Int, String>(1 to "one",2 to "two",3 to "three")
    println("for loop for iterating over map - start")
    for((key,value) in map){
        println("Element with key $key has value $value")
    }
    println("for loop for iterating over map - end")

    println("for loop iterating over range - start")
    for(i in 1 until list.size){
        println("Element at i position ${list.get(i)}")
    }
    println("for loop iterating over range - end")

    println("for loop iterating over complex range - start")
    for(i in 0 until list.size step 2){
        println("Element at i position ${list.get(i)}")
    }
    println("for loop iterating over complex range - end")

    println("for loop iterating over string - start")
    for(ch in "abcd"){
        print(ch + 1)
    }

    println("\nfor loop iterating over string - end")
}