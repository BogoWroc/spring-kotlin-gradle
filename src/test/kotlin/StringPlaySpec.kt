import hello.sumOperationAsFormattedString
import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object StringPlaySpec : Spek({
    describe("a string formatting"){
        it("should returns formatted string"){
            val formattedString = sumOperationAsFormattedString(1, 2)
            Assertions.assertThat(formattedString).isEqualTo("Result of operation (1 + 2) is 3")
        }
    }
    describe("a string split"){
        it("should split string by word"){
            val split: List<String> = "Egg and potato".split(delimiters = "and").map { it -> it.trim() }
            Assertions.assertThat(split.size).isEqualTo(2)
            Assertions.assertThat(split).containsAll(listOf("Egg","potato"))
        }
    }
})
