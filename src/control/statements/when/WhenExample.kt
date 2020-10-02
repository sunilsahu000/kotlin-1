package control.statements.`when`

fun main(){
println(returnColorAsAString(Color.RED));
}

fun returnColorAsAString(color: Color): String{

     return when(color){
        Color.BLUE -> println("color is blue")
        Color.GREEN ->println ("color is green")
        Color.RED ->println ("color is red")
    }

}
