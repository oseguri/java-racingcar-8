package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameResultTest {

    private List<RacingCar> carListOneWinner;
    private List<RacingCar> carListTwoWinner;
    @BeforeEach
    void setUp() {
        RacingCar r1 = new RacingCar("test1");
        r1.run(4);
        RacingCar r2 = new RacingCar("test2");
        r2.run(4);
        r2.run(4);
        RacingCar r3 = new RacingCar("test1");
        r3.run(4);
        RacingCar r4 = new RacingCar("test3");
        r4.run(4);
        r4.run(4);

        carListOneWinner = new ArrayList<>(List.of(r1,r2,r3));
        carListTwoWinner = new ArrayList<>(List.of(r1,r2,r4));
    }
    
    
    @Test
    void testWinnerList() {
        GameResult gameResult = new GameResult();

        gameResult.setResult(carListTwoWinner);
        Assertions.assertEquals(List.of("test2", "test3"), gameResult.getWinnerList());

        gameResult.setResult(carListOneWinner);
        Assertions.assertEquals(List.of("test2"), gameResult.getWinnerList());

    }


}
