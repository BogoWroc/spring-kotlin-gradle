package basic.classesAndObjects.propertiesAndFields

/**
 * Created by Bogumil Zebek on 2017-11-23.
 */
class LateInitPropertyExample {

    private lateinit var variable: String

    fun setUp(value: String) {
        this.variable = value
    }

    fun getValue(): String {
        return this.variable
    }
}