package baseball;

import java.util.List;

public class NumberValidator {
    private static final String DIGIT = "[0-9]+";
    private static final String ERROR_PREFIX = "[ERROR]";
    private static final String INVALID_RANGE = " 숫자의 범위는 1부터 9까지 입니다.";
    private static final String INVALID_RESTART_RANGE = " 1또는 2를 입력 해주세요";
    private static final String IS_DUPLICATED = " 중복되지 않는 숫자를 입력 해주세요";
    private static final String INVALID_AMOUNT = " 3개의 숫자를 입력 해주세요";

    public static int isNumber(String input) {
        if (!input.matches(DIGIT)) {
            throw new IllegalArgumentException(ERROR_PREFIX + " 올바른 숫자를 입력 해주세요.");
        }
        return Integer.parseInt(input);
    }

    public static void isInRange(List<Integer> numbers) {
        numbers.forEach(NumberValidator::validateRange);
    }

    private static void validateRange(Integer number) {
        if (number > 9 || number < 0) {
            throw new IllegalArgumentException(ERROR_PREFIX + INVALID_RANGE);
        }
    }

    public static void isInRange(int number) {
        if (number > 2 || number < 1) {
            throw new IllegalArgumentException(ERROR_PREFIX + INVALID_RESTART_RANGE);
        }
    }

    public static void isDuplicate(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException(ERROR_PREFIX + IS_DUPLICATED);
        }
    }

    public static void isInAmount(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException(ERROR_PREFIX + INVALID_AMOUNT);
        }
    }
}
