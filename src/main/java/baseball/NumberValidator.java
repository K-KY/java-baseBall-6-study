package baseball;

public class NumberValidator {
    private static final String DIGIT = "[0-9]+";

    public int isNumber(String input) {
        if (!input.matches(DIGIT)) {
            throw new IllegalArgumentException("[ERROR] 올바른 숫자를 입력 해주세요.");
        }
        return Integer.parseInt(input);
    }

    public void isInRange(int number) {
        if (number > 9 || number < 0) {
            throw new IllegalArgumentException("[ERROR] 숫자의 범위는 1부터 9까지 입니다.");
        }
    }
}
