package racingcar;

import java.util.*;

public class GameResult {

    private final Map<String, Integer> gameInfo = new HashMap<>();

    public void setResult(List<RacingCar> carList) {
        this.gameInfo.clear();
        carList.forEach(this::putRacingCar);
    }

    public void putRacingCar(RacingCar car) {
        gameInfo.put(car.getName(), car.getDistance());
    }

    public void printResult() {
        ResultView.printResult(this.gameInfo);
    }

    public void printWinner() {
        ResultView.printWinner(getWinnerList());
    }

    public List<String> getWinnerList() {
        List<String> winnerList = new ArrayList<>();

        int max = Collections.max(gameInfo.values());

        gameInfo.forEach((name, distance) -> {
            if (distance == max) winnerList.add(name);
        });

        return winnerList;
    }

}
