package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class NumberValidatorTest {

    @Test
    void isNotNumber() {
        NumberValidator numberValidator = new NumberValidator();
        assertThatThrownBy(() -> numberValidator.isNumber("a")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void isNumber() {
        NumberValidator numberValidator = new NumberValidator();
        assertThatCode(() -> numberValidator.isNumber("1")).doesNotThrowAnyException();
    }

    @Test
    void isNotInRange() {
        NumberValidator numberValidator = new NumberValidator();
        assertThatThrownBy(() -> numberValidator.isInRange(10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void isInRange() {
        NumberValidator numberValidator = new NumberValidator();
        assertThatCode(() -> numberValidator.isInRange(9)).doesNotThrowAnyException();
    }
}
