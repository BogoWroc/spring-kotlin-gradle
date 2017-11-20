import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertTrue

@RunWith(JUnitPlatform::class)
object FixtureSpec : Spek({
    describe("a group") {
        beforeGroup {
            println("Execute some actions before group of tests")
        }

        beforeEachTest {
            println("Execute some actions before each test")
        }

        context("a nested group") {

            beforeEachTest {
                println("Action1 will be added group beforeEachTest")
            }

            beforeEachTest {
                println("Action2 will be added to beforeEachTest chain")
            }

            it("should work") { assertTrue(true) }
        }

        it("do something") { assertTrue(true) }

        afterEachTest {
            println("Execute some actions after each test")
        }

        afterGroup {
            println("Execute some actions after group of tests")
        }
    }
})