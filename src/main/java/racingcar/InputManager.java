package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.regex.Pattern;

public class InputManager {

    public static Input getInput() {
        String cars = Console.readLine();
        String round = Console.readLine();

        if (!checkCars(cars) || !checkRounds(round)) throw new IllegalArgumentException();

        List<String> carList = List.of(cars.trim().split(","));
        int roundNum = Integer.parseInt(round);

        return new Input(carList, roundNum);
    }

    public static Boolean checkCars(String cars) {
        List<String> carList = List.of(cars.trim().split(","));

        if(carList.stream().distinct().count() != carList.size()) return false;

        return carList.stream().allMatch(
                name -> Pattern.matches(".{1,5}", name)
        );
    }

    public static Boolean checkRounds(String round) {
        return round.matches("\\d+");
    }

}
