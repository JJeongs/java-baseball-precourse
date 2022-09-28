package baseball;

import java.util.regex.Pattern;

public class BaseballService {
    public void validateInput(String number) {
        if (!isThreeDigitNumberWithoutZero(number)) {
            throw new IllegalArgumentException();
        }
        if (hasDuplicatedDigit(number)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean hasDuplicatedDigit(String number) {
        if (number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                || number.charAt(1) == number.charAt(2)) {
            return true;
        }
        return false;
    }

    private boolean isThreeDigitNumberWithoutZero(String number) {
        String pattern = "[1-9][1-9][1-9]";
        return Pattern.matches(pattern, number);
    }
}
