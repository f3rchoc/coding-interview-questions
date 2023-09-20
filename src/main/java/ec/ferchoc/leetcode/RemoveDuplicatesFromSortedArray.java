package ec.ferchoc.leetcode;

/**
 * From <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">remove-duplicates-from-sorted-array</a>.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] numbs) {
        int index = 1;
        for (int i = 1; i < numbs.length; i++) {
            if (numbs[i] != numbs[i - 1]) {
                numbs[index] = numbs[i];
                index++;
            }
        }
        return index;
    }

}
