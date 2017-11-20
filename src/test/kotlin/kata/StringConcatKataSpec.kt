package kata

import com.nhaarman.mockito_kotlin.description
import hello.SampleCalculator
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.Spec
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object StringConcatKataSpec : Spek({
    describe("a string concatenation") {
        val concatString: (s1: String, s2: String) -> String = { string1, string2 -> string1 + string2 }

        it("should return concat string") {
            val result = concatString("a","b")
            Assert.assertEquals("ab", result)
        }
    }
})