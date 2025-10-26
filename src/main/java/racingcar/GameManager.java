package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private final List<RacingCar> carList;

    private int round;

    private final GameResult gameResult;

    public GameManager(Input input) {
        this.round = input.round();

        this.carList = new ArrayList<>();
        input.carList().forEach(name -> this.carList.add(new RacingCar(name)));

        this.gameResult = new GameResult();

    }

    public void start() {
        while (this.round > 0) {
            doRound();
            gameResult.printResult();
        }
        gameResult.printWinner();
    }

    public void doRound() {
        carList.forEach(RacingCar::run);
        this.round--;
        this.gameResult.setResult(this.carList);
    }


}
