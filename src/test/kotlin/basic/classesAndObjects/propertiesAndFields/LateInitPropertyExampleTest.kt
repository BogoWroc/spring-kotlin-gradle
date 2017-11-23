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
class LateInitPropertyExampleTest : Spek({
    describe("a initialization") {
        var lateInitPropertyExample: LateInitPropertyExample? = null

        beforeEachTest {
            lateInitPropertyExample = LateInitPropertyExample()
        }

        it("should be done on setUp method execution only") {
            val testValue = "My init value"
            lateInitPropertyExample?.setUp(testValue)
            Assertions.assertThat(lateInitPropertyExample?.getValue()).isEqualTo(testValue)
        }
        it("should thrown exception when property was not initialized before use") {
            Assertions.assertThatThrownBy { lateInitPropertyExample?.getValue() }.hasMessage("lateinit property" +
                    " variable has not been initialized")
        }
    }
})