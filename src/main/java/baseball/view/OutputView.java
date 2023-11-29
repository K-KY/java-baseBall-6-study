package baseball.view;

import baseball.model.BaseBallScore;
import java.util.List;

public class OutputView {

    private static final String NOTHING = "낫싱";
    private static final String NULL = "";
    private static final String BALL = "볼 ";
    private static final int ZERO = 0;
    private static final String STRIKE = "스트라이크";

    public static void printResult(List<String> scores) {
        int ball = (int) scores.stream().filter(BaseBallScore::isBall).count();
        int strike = (int) scores.stream().filter(BaseBallScore::isStrike).count();
        if (ball == ZERO && strike == ZERO) {
            System.out.println(NOTHING);
        }
        System.out.println(ballScore(ball) + strikeScore(strike));
    }

    private static String ballScore(int ball) {
        if (ball == ZERO) {
            return NULL;
        }
        return ball + BALL;
    }

    private static String strikeScore(int strike) {
        if (strike == ZERO) {
            return NULL;
        }
        return strike + STRIKE;
    }
}
