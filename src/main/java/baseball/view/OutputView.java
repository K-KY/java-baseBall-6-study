package baseball.view;

import baseball.BaseBallScore;
import java.util.List;

public class OutputView {

    public static void printResult(List<String> scores) {
        int ball = (int) scores.stream().filter(BaseBallScore::isBall).count();
        int strike = (int) scores.stream().filter(BaseBallScore::isStrike).count();
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
        System.out.println(ballScore(ball) + strikeScore(strike));
    }

    private static String ballScore(int ball) {
        if (ball == 0) {
            return "";
        }
        return ball + "볼 ";
    }

    private static String strikeScore(int strike) {
        if (strike == 0) {
            return "";
        }
        return strike + "스트라이크";
    }
}
