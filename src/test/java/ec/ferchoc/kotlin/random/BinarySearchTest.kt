package ec.ferchoc.kotlin.random

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class BinarySearchTest {

    private lateinit var binarySearch: BinarySearch

    @BeforeEach
    fun setUp() {
        binarySearch = BinarySearch()
    }

    @ParameterizedTest
    @MethodSource("inputArrayTargetExpectedValue")
    fun givenSortedArray_whenSearchItem_thenReturnElementPosition(sortedList: IntArray, target: Int, expectedValue: Int) {
        val solution = binarySearch.searchItem(sortedList, target)
        Assertions.assertThat(solution == expectedValue)
    }



    companion object {
        @JvmStatic
        fun inputArrayTargetExpectedValue(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 3, 5, 7, 9), 1, 0),
                Arguments.of(intArrayOf(1, 2, 3), 6, -1),
                Arguments.of(intArrayOf(1, 3, 5, 7, 9), 3, 1)
            )
        }
    }
}

