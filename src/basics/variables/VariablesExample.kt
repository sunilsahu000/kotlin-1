package basics.variables

fun main(){
    val name = "Farhan";
    val lastName: String = "Inamdar";
    /*name = "something" If this line is uncommented then it gives a compiler error
            as variables declared with the keyword val are readonly and once assigned*/
    var someStr = "helloworld";
    //someStr = 1;
    /*the above line also gives a compiler error because someStr has been assigned a string
     so the compiler infers the type of someStr as a string.*/
}