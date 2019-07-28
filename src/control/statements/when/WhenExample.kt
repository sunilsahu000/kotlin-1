package control.statements.`when`

fun main(){
println(returnColorAsAString(Color.RED));
}

fun returnColorAsAString(color: Color): String{

     return when(color){
        Color.BLUE -> "color is blue"
        Color.GREEN -> "color is green"
        Color.RED -> "color is red"
    }

}