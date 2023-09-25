package ec.ferchoc.java.leetcode;

import java.util.Map;
import java.util.Stack;

/**
 * From <a href="https://leetcode.com/problems/valid-parentheses/">valid-parentheses</a>.
 */
public class ValidParentheses {

    public boolean solution(String input) {

        Map<Character, Character> brackets = Map
                .of('(', ')', '{', '}', '[', ']');

        Stack<Character> values = new Stack<>();

        for (int index = 0; index < input.length(); index++) {

            final var bracket = input.charAt(index);

            if (brackets.containsKey(bracket)) {// is an open bracket
                values.push(brackets.get(bracket)); // add the close bracket
            } else if (!values.isEmpty() && values.peek() == bracket) {// last element is closed bracket
                values.pop();
            } else {
                return false;
            }

        }

        return values.empty();
    }

}
