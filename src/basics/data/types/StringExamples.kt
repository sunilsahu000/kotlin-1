package basics.data.types

fun main(){
    var escapedString: String = "This \n\tis \n\t\tan \n\t\t\tescaped string";
    println(escapedString)

    var rawString: String = """
        This
            is
                a
                    raw string
    """.trimIndent()
    println(rawString)
}