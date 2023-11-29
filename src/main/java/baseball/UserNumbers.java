package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class UserNumbers implements BallSeparator {
    private final List<Ball> userBalls;
    public UserNumbers(List<Integer> userNumbers) {
        userBalls = separator(userNumbers);
    }

    @Override
    public List<Ball> separator(List<Integer> generated) {
        List<Ball> balls = new ArrayList<>();
        IntStream.rangeClosed(0, 2).forEach(num -> balls.add(new Ball(num, generated.get(num))));
        return balls;
    }

    public void score(ComputerNumbers computerBalls) {
        List<String> collect = userBalls.stream().map(computerBalls::score).toList();
        System.out.println(collect);
    }
}
