package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.model.NumberValidator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NumberValidatorTest {

    @Test
    void isNotNumber() {
        assertThatThrownBy(() -> NumberValidator.isNumber("a")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void isNumber() {
        assertThatCode(() -> NumberValidator.isNumber("1")).doesNotThrowAnyException();
    }

    @Test
    void isNotInRange() {
        assertThatThrownBy(() -> NumberValidator.isInRange(List.of(10, 11, 12))).isInstanceOf(
                IllegalArgumentException.class);
    }

    @Test
    void isInRange() {
        assertThatCode(() -> NumberValidator.isInRange(List.of(1, 2, 3))).doesNotThrowAnyException();
    }

    @Test
    void isDuplicate() {
        assertThatThrownBy(() -> NumberValidator.isDuplicate(List.of(1, 1, 2))).isInstanceOf(
                IllegalArgumentException.class);
    }

    @Test
    void isNotDuplicate() {
        assertThatCode(() -> NumberValidator.isDuplicate(List.of(1, 3, 2))).doesNotThrowAnyException();
    }

    @Test
    void isInAmount() {
        assertThatCode(() -> NumberValidator.isInAmount(List.of(1, 3, 2))).doesNotThrowAnyException();
    }

    @Test
    void isNotInAmount() {
        assertThatThrownBy(() -> NumberValidator.isInAmount(List.of(1, 3, 2, 5))).isInstanceOf(
                IllegalArgumentException.class);
    }
}
