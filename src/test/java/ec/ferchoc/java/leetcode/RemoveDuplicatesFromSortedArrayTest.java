package ec.ferchoc.java.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        this.removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("arrayInputAndExpectedSizeAndExpectedSequence")
    void givenArrayOfInteger_whenRemoveDuplicatesFromSortedArray_thenReturnTheNumberOfUniqueElements (
            int [] numbs, int expectedSize, int [] expectedSequence) {

        // given    -> preconditions or setup
//        var numbs = new int[]{0,0,1,1,1,2,2,3,3,4};

        // when     -> action or the behaviour that we are going test
        int solution = this.removeDuplicatesFromSortedArray
                .removeDuplicates(numbs);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedSize);
        Assertions.assertThat(numbs).containsSequence(expectedSequence);

    }

    static Stream<Arguments> arrayInputAndExpectedSizeAndExpectedSequence() {
        return Stream.of(Arguments.of(new int[]{1,1,2}, 2, new int[]{1,2}),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5, new int[]{0,1,2,3,4}),
                Arguments.of(new int[]{1,2}, 2, new int[]{1,2}));
    }

}