package basic.classesAndObjects.propertiesAndFields

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by Bogumil Zebek on 2017-11-23.
 */
@RunWith(JUnitPlatform::class)
object CustomGetterSetterExampleSpec : Spek({
    describe("a getter/setter"){
        val getterSetterExample = CustomGetterSetterExample()
        it("should be possible to set new value"){
            getterSetterExample.name = "New value"
            Assertions.assertThat(getterSetterExample.name).isEqualTo("New value")

            getterSetterExample.name = "Modified value"
            Assertions.assertThat(getterSetterExample.name).isEqualTo("Modified value")
        }
    }
})