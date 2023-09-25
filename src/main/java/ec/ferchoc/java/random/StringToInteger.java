package ec.ferchoc.java.random;

/**
 * Random problem. Convert a input string to integer.
 */
public class StringToInteger {

    public Integer solution(String input) {

        var index = 0;
        var negative = false;

        if ('-' == input.charAt(0)) {
            index++;
            negative = true;
        }

        var number = 0;
        while (index < input.length()) {

            final var myChar = input.charAt(index);
            if (!Character.isDigit(myChar)) {
                throw new NumberFormatException("Not a number");
            }
            final var intValue = myChar - '0';
            number = number*10 + intValue;
            index++;

        }

        if (negative) {
            number = -number;
        }

        return number;
    }

}
