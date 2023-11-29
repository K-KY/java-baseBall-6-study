package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private static final List<Integer> generatedNumber = new ArrayList<>();
    public static List<Integer> generateNumber() {
        generatedNumber.clear();
        while (generatedNumber.size() < 3) {
            generate();
        }
        return generatedNumber;
    }

    private static void generate() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        if (!generatedNumber.contains(randomNumber)) {
            generatedNumber.add(randomNumber);
        }
    }
}
