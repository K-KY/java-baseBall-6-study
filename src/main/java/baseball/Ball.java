package baseball;

import java.util.Objects;

public class Ball {
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private int position;
    private int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public String score(Ball ball) {
        if (isBall(ball)) {
            return BALL;
        }

        if (equals(ball)) {
            return STRIKE;
        }
        return NOTHING;
    }

    public boolean isBall(Ball ball) {
        return !equals(ball) && ball.number == this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
