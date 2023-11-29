package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BallSeparatorTest {

    @Test
    void separateBalls() {
        UserNumbers userNumbers = new UserNumbers(List.of(1,2,3));
        ComputerNumbers computerNumbers = new ComputerNumbers(List.of(1,2,3));
        userNumbers.separator(List.of(1,2,3)).forEach(ball -> assertThat(ball).isInstanceOf(Ball.class));
        computerNumbers.separator(List.of(1,2,3)).forEach(ball -> assertThat(ball).isInstanceOf(Ball.class));
    }
}
