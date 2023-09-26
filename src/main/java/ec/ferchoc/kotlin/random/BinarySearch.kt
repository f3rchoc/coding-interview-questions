package ec.ferchoc.kotlin.random

/**
 * Implements a simple binary search.
 */
class BinarySearch {

    fun searchItem(sortedList: IntArray, target: Int) : Int {
        var low = 0
        var high = sortedList.size - 1
        while (low <= high) {
            val middle = low + (high - low)/2
            val guest = sortedList[middle]
            when {
                guest == target -> return middle
                guest > target -> high = middle - 1
                else -> {
                    low = middle + 1
                }
            }
        }
        return -1;
    }
}