package academy.learnprogramming.chelange

import hello.ChellangeTwo

/**
 * Created by Bogumil Zebek on 2017-11-29.
 */
fun main(args: Array<String>) {
    var float1 = -3847.384f
    var float2: Float? = -3847.384f

    val shortArray = Array<Short>(5) { it -> (it + 1).toShort()}
    for (s in shortArray){
        println(s)
    }

    var intArray = Array<Int?>(40) { i -> (i +1) *5}


    var chars = charArrayOf('a', 'b','c')
    ChellangeTwo.method1(chars)

    val x: String? = "I AM UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
}