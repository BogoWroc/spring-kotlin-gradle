package basic.classesAndObjects

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by Bogumil Zebek on 2017-11-30.
 */
@RunWith(JUnitPlatform::class)
object DataClassExampleSpec : Spek({
    describe("a data class") {
        it("should has option to make instance copy") {
            val car1 = Car(model = "Toyota", color = "blue")
            val car2 = car1.copy(color = "yellow")
            Assertions.assertThat(car2).isEqualTo(Car("Toyota", color = "yellow"))
        }
    }
})