package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.Ball;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    void strikeTest() {
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(1, 2);
        assertThat(ball1).isEqualTo(ball2);
    }

    @Test
    void ballTest() {
        Ball ball1 = new Ball(1, 2);
        Ball ball = new Ball(2, 2);
        assertThat(ball1).isNotEqualTo(ball);
        assertThat(ball.isBall(ball1)).isTrue();
    }
}
