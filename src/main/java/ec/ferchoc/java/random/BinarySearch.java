package ec.ferchoc.java.random;

public class BinarySearch {

    /**
     * Implement binary search to find an item.
     * @param sortedList A sorted list.
     * @param item The item to find.
     * @return null if item not found or the position of element.
     */
    public Integer searchItem(int [] sortedList, int item) {

        var low = 0;
        var high = sortedList.length - 1;

        while (low <= high) {
            var mid = (high + low) / 2; ////lowerBound + ( upperBound - lowerBound ) / 2
            var guest = sortedList[mid];
            if (guest == item) {
                return mid;
            } else if (guest > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;

    }

}
