package racingcar;

import java.util.List;
import java.util.Map;

public class ResultView {
    public static void printResult(Map<String, Integer> gameInfo) {
        gameInfo.forEach((name, distance) ->
                System.out.println(name + " : " + distanceToString(distance))
        );
        System.out.println();
    }

    public static void printWinner(List<String> winnerList) {
        String winners = String.join(", ", winnerList);
        System.out.println("최종 우승자 : " + winners);
    }

    private static String distanceToString(int distance) {
        return "-".repeat(distance);
    }

}
