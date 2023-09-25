package ec.ferchoc.java.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        this.palindromeNumber = new PalindromeNumber();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("intInputAndExpectedValue")
    void givenAnInteger_whenIsPalindrome_thenReturnTrueIfIsPalindrome (int input, boolean expectedValue) {

        // given    -> preconditions or setup

        // when     -> action or the behaviour that we are going test
        var solution = this.palindromeNumber.isPalindrome(input);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedValue);

    }

    static Stream<Arguments> intInputAndExpectedValue() {
        return Stream.of(Arguments.of(123, false),
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false));
    }

}