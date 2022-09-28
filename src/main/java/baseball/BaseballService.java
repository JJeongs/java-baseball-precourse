package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
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

    public String generateRandomThreeDigitNumber() {
        List<Integer> number = new ArrayList<>();
        while (number.size() < 3) {
            number.add(getDigitNotIn(number));
        }
        return convertIntegerListToString(number);
    }

    private String convertIntegerListToString(List<Integer> list) {
        String result = "";
        for (Integer item : list) {
            result += item;
        }
        return result;
    }

    private int getDigitNotIn(List<Integer> number) {
        int digit = Randoms.pickNumberInRange(1, 9);
        while (number.contains(digit)) {
            digit = Randoms.pickNumberInRange(1, 9);
        }
        return digit;
    }
}
