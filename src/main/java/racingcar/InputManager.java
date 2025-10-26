package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class InputManager {

    public static Map<String, String> input(){

        String cars = Console.readLine();
        String round = Console.readLine();

        if(!checkCars(cars) || !checkRounds(round)) throw new IllegalArgumentException();

        Map<String,String> inputs = new HashMap<>();
        inputs.put("cars", cars);
        inputs.put("round", round);

        return inputs;
    }

    public static Boolean checkCars(String cars) {
        List<String> carList = List.of(cars.split(","));
        return carList.stream().allMatch(name-> Pattern.matches(".{1,5}", name));
    }

    public static Boolean checkRounds(String round) {
        return round.matches("\\d+");
    }

    public static void main(String[] args) {
        Map<String, String> input = input();
        System.out.println(input.get("cars"));
        System.out.println(input.get("round"));
    }
}
