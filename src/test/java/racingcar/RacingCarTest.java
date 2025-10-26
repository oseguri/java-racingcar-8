package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingCarTest {
    @Test
    public void testConstructor() {
        RacingCar car = new RacingCar("test");
        Assertions.assertEquals("test", car.getName());
        Assertions.assertEquals(0, car.getDistance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9})
    void testRun(int value) {
            RacingCar rc = new RacingCar("test");
            rc.run(value);
            if(value >= 4) Assertions.assertEquals(1, rc.getDistance());
            else Assertions.assertEquals(0, rc.getDistance());
    }


}
