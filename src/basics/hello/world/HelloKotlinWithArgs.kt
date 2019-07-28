package basics.hello.world

fun main(args: Array<String>){
    val name = if(args.size == 0) "Kotlin" else args[0];
    println("Hello $name");
}