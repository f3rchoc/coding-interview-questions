package ec.ferchoc.random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringToIntegerTest {


    private StringToInteger stringToInteger;

    @BeforeEach
    void setUp() {
        this.stringToInteger = new StringToInteger();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("stringInputAndExpectedValue")
    void givenInputString_whenStringToInteger_thenReturnInteger (String input, Integer expectedValue) {

        // given    -> preconditions or setup
//        var input = "123";

        // when     -> action or the behaviour that we are going test
        var solution =  this.stringToInteger.solution(input);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedValue);

    }

    static Stream<Arguments> stringInputAndExpectedValue() {
        return Stream.of(Arguments.of("123", 123),
                Arguments.of("0", 0),
                Arguments.of("-456", -456));
    }

}