package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class UserNumberTest {

    @Test
    void scoreNumber_3Strike() {
        UserNumbers userNumbers = new UserNumbers(List.of(1,2,3));
        ComputerNumbers computerNumbers = new ComputerNumbers(List.of(1,2,3));
        int score = userNumbers.score(computerNumbers).stream().filter(BaseBallScore::isStrike).toList().size();
        assertThat(score).isEqualTo(3);
    }

    @Test
    void scoreNumber_2Ball_1Strike() {
        UserNumbers userNumbers = new UserNumbers(List.of(3,2,1));
        ComputerNumbers computerNumbers = new ComputerNumbers(List.of(1,2,3));
        int score = userNumbers.score(computerNumbers).stream().filter(BaseBallScore::isStrike).toList().size();
        assertThat(score).isEqualTo(1);
        score = userNumbers.score(computerNumbers).stream().filter(BaseBallScore::isBall).toList().size();
        assertThat(score).isEqualTo(2);
    }

    @Test
    void scoreNumber_3Nothing() {
        UserNumbers userNumbers = new UserNumbers(List.of(6,7,8));
        ComputerNumbers computerNumbers = new ComputerNumbers(List.of(1,2,3));
        int score = userNumbers.score(computerNumbers).stream().filter(BaseBallScore::isNothing).toList().size();
        assertThat(score).isEqualTo(3);
    }
}
