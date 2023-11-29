package baseball;

import java.util.Objects;

public class Ball {
    private int position;
    private int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public String score(Ball ball) {
        if (isBall(ball)) {
            return "볼";
        }

        if (equals(ball)) {
            return "스트라이크";
        }
        return "낫싱";
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
