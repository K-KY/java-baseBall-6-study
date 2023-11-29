package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.NumberGenerator;
import org.junit.jupiter.api.Test;

public class NumberGenerateTest {

    @Test
    void numberGenerate() {
        NumberGenerator.generateNumber().forEach(number -> assertThat(number).isBetween(1, 9));
    }

}
