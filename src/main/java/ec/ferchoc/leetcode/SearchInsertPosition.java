package ec.ferchoc.leetcode;

/**
 * From <a href="https://leetcode.com/problems/search-insert-position/">search-insert-position</a>.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] numbs, int target) {

        var low = 0;
        var high = numbs.length - 1;

        while (low <= high) {
            var middle = (high + low) / 2;
            var guest = numbs[middle];

            if (guest == target) {
                return middle;
            }

            if (guest > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }

        return low;

    }

}
