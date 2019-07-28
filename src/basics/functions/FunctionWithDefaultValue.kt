package basics.functions

fun repeatCharacterForCount(char: Char = '*', count: Int = 10){
    repeat(count){
        print(char);
    }
}

fun main(){
    repeatCharacterForCount();//takes the default parameters
    println();
    repeatCharacterForCount('#',5);//parameters are explicitly specified
    println();
    repeatCharacterForCount(count = 3);//only the second parameter is specified. In this case, named parameter syntax is to be used
    println();
}