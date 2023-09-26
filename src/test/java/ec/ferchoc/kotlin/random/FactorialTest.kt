package ec.ferchoc.kotlin.random

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FactorialTest {

    private lateinit var factorial : Factorial

    @BeforeEach
    fun setUp() {
        factorial = Factorial()
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedValue")
    fun givenNumber_WhenCalculateRecursive_ThenReturnFactorial(value: Int, expectedValue: Int) {

        // given
//        val value = 3

        // when
        val solution = factorial.calculateRecursive(value)

        // then
        Assertions.assertThat(solution).isEqualTo(expectedValue)

    }

    companion object {

        @JvmStatic
        fun inputAndExpectedValue(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(3, 6)
            )
        }

    }

}

