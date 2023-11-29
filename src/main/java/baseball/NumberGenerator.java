package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private static final List<Integer> generatedNumber = new ArrayList<>();
    private static final int LIMIT = 3;
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 9;

    public static List<Integer> generateNumber() {
        generatedNumber.clear();
        while (generatedNumber.size() < LIMIT) {
            generate();
        }
        return generatedNumber;
    }

    private static void generate() {
        int randomNumber = Randoms.pickNumberInRange(START_RANGE, END_RANGE);
        if (!generatedNumber.contains(randomNumber)) {
            generatedNumber.add(randomNumber);
        }
    }
}
