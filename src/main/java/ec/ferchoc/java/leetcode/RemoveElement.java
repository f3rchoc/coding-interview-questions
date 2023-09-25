package ec.ferchoc.java.leetcode;

/**
 * From {@link <a href="https://leetcode.com/problems/remove-element/">remove-element</a>}
 */
public class RemoveElement {

    public int removeElement(int[] numbs, int val) {

        var size =  numbs.length;
        var k = 0;

        for (int i = 0; i < size; i++) {
            if (numbs[i] != val) {
                numbs[k] = numbs[i];
                k++;
            }
        }

        return k;
    }

}
