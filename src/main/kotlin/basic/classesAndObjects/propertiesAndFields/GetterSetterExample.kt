package basic.classesAndObjects.propertiesAndFields

/**
 * Created by Bogumil Zebek on 2017-11-23.
 */
class GetterSetterExample{
    var name = "Init"
        get() = field
        set(value) {
            println("Setter")
            field = value
        }
}
