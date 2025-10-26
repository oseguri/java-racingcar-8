package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

public class GameManagerTest {
    GameManager gm;
    Field round;
    Field carList;

    @BeforeEach
    void set() throws NoSuchFieldException {
        Input input = new Input(
                List.of("car1","car2","car3"),5 );
        gm = new GameManager(input);
        round = gm.getClass().getDeclaredField("round");
        round.setAccessible(true);
        carList = gm.getClass().getDeclaredField("carList");
        carList.setAccessible(true);
    }

    @Test
    @SuppressWarnings("unchecked")
    void TestRound() throws IllegalAccessException {
        gm.doRound();
        Assertions.assertEquals(4, round.get(gm));
        List<RacingCar> list = (List<RacingCar>) carList.get(gm);
        list.forEach(racingcar -> Assertions.assertTrue(racingcar.getDistance() == 0 || racingcar.getDistance() == 1));
    }

}
