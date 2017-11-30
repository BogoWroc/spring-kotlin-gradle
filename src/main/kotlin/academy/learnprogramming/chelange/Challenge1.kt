package academy.learnprogramming.chelange

/**
 * Created by Bogumil Zebek on 2017-11-28.
 */
fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)
    println(hello1 == hello2)

    var num = 2988

    val text: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (text is String){
        println(text.toUpperCase())
    }
    println("""    1
                |   11
                |  111
                | 1111
    """.trimMargin())

    var someArray = Array<Int>(5) {it -> 0}

    var a :String? = null
    var i = a ?: "Default value"
}