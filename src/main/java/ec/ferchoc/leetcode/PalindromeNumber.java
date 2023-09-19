package ec.ferchoc.leetcode;

/**
 * From <a href="https://leetcode.com/problems/palindrome-number/">palindrome-number</a>.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        int input = x;
        var palindrome = 0;

        while (input > 0) {
            var rest = input%10;
            input = input/10;
            palindrome = palindrome*10 + rest;
        }
        return x - palindrome == 0;

    }

}
