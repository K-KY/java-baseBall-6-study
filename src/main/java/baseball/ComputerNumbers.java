package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ComputerNumbers implements BallSeparator {
    private static final String NOTHING = "낫싱";
    private static final int START = 0;
    private static final int END = 2;
    private final List<Ball> computerBalls;

    public ComputerNumbers(List<Integer> generated) {
        computerBalls = separator(generated);
    }

    @Override
    public List<Ball> separator(List<Integer> generated) {
        List<Ball> balls = new ArrayList<>();
        IntStream.rangeClosed(START, END).forEach(num -> balls.add(new Ball(num, generated.get(num))));
        return balls;
    }

    public String score(Ball userBall) {
        return computerBalls.stream()
                .map(ball -> ball.score(userBall))
                .filter(score -> !score.equals(NOTHING))
                .findFirst()
                .orElse(NOTHING);
    }
}