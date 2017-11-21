import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object WhenSpecTest: Spek({
    describe("a when keyword"){
        fun simulateJavaSwitch(x:Any): Boolean = when(x){
            is String -> true
            else -> false
        }

        it("should work similar to switch"){
            Assertions.assertThat(simulateJavaSwitch("some string")).isTrue()
            Assertions.assertThat(simulateJavaSwitch(10)).isFalse()

        }

    }
})