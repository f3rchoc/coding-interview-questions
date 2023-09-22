package ec.ferchoc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SearchInsertPositionTest {

    private  SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        this.searchInsertPosition = new SearchInsertPosition();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("arrayInputAndTargetAndOutputValue")
    void given_when_then (int[] numbs, int target, int output) {

        // given    -> preconditions or setup

        // when     -> action or the behaviour that we are going test
        var solution = this.searchInsertPosition.searchInsert(numbs, target);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(output);

    }

    public static Stream<Arguments> arrayInputAndTargetAndOutputValue() {

        return Stream.of(
            Arguments.of(new int[]{1,3,5,6}, 5, 2),
            Arguments.of(new int[]{1,3,5,6}, 2, 1),
            Arguments.of(new int[]{1,3,5,6}, 7, 4)
        );

    }

}