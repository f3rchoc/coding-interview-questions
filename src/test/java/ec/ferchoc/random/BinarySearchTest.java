package ec.ferchoc.random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BinarySearchTest {

    private BinarySearch binarySearch;

    static Stream<Arguments> arrayInputAndSearchItemAndExpectedValue() {
        return Stream.of(Arguments.of(new int[]{1, 3, 5, 7, 9}, 1, 0),
            Arguments.of(new int[]{1, 2, 3}, 6, null),
                Arguments.of(new int[]{1, 3, 5, 7, 9}, 3, 1)
        );
    }

    @BeforeEach
    void setUp() {
        this.binarySearch = new BinarySearch();
    }

    // Junit test for
    @ParameterizedTest
    @MethodSource("arrayInputAndSearchItemAndExpectedValue")
    void givenInputArray_whenSearchItem_thenReturnExpectedValue (
            int [] sortedList, int item, Integer expectedValue) {

        // given    -> preconditions or setup

        // when     -> action or the behaviour that we are going test
        var solution = this.binarySearch.searchItem(sortedList, item);

        // then     -> verify the action
        Assertions.assertThat(solution).isEqualTo(expectedValue);

    }

}