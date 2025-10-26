package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InputManagerTest {

    @ParameterizedTest
    @ValueSource(strings = {"a1,b2,c3", "abce,b,c", "abc"})
    void validationTrueTest(String value) {
        Assertions.assertTrue(InputManager.checkCars(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "abcdef,b,c", "abc, bde  , cd"})
    void validationFalseTest(String value) {
        Assertions.assertFalse(InputManager.checkCars(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","12153","123"})
    void checkRoundsTrueTest(String value) {
        Assertions.assertTrue(InputManager.checkRounds(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a","bc", "."})
    void checkRoundsFalseTest(String value) {
        Assertions.assertFalse(InputManager.checkRounds(value));
    }
}
