package ec.ferchoc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveElementTest {

    private RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        this.removeElement = new RemoveElement();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("arrayInputAndExpectedValue")
    void given_when_then (int[] numbs, int val, int expectedValue, int [] expectedSequence) {

        // given    -> preconditions or setup

        // when     -> action or the behaviour that we are going test
        var solution = this.removeElement.removeElement(numbs, val);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedValue);
        Assertions.assertThat(numbs).containsSequence(expectedSequence);

    }

    public static Stream<Arguments> arrayInputAndExpectedValue() {

        return Stream.of(
                Arguments.of(new int[]{3,2,2,3}, 3, 2, new int[]{2, 2}),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, 5, new int[]{0,1,3,0,4}),
                Arguments.of(new int[]{3,3}, 4, 2, new int[]{3, 3})
        );

    }


}