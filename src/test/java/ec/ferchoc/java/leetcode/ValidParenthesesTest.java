package ec.ferchoc.java.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        this.validParentheses = new ValidParentheses();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("stringInputAndExpectedValue")
    void givenInputString_whenValidParentheses_thenReturnExpectedValue (String input, boolean expectedValue) {

        // given    -> preconditions or setup
//        var input = "()";

        // when     -> action or the behaviour that we are going test
        var solution = this.validParentheses.solution(input);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedValue);

    }

    static Stream<Arguments> stringInputAndExpectedValue() {
        return Stream.of(Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("]", false));
    }

}