package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class UserNumbers implements BallSeparator {
    private static final int START = 0;
    private static final int END = 2;
    private final List<Ball> userBalls;
    public UserNumbers(List<Integer> userNumbers) {
        userBalls = separator(userNumbers);
    }

    @Override
    public List<Ball> separator(List<Integer> generated) {
        List<Ball> balls = new ArrayList<>();
        IntStream.rangeClosed(START, END).forEach(num -> balls.add(new Ball(num, generated.get(num))));
        return balls;
    }

    public List<String> score(ComputerNumbers computerBalls) {
        return userBalls.stream().map(computerBalls::score).toList();
    }
}
