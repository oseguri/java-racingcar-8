package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    private final String name;
    private int distance;

    public RacingCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void run() {
        run(Randoms.pickNumberInRange(0,9));
    }

    public void run(int value) {
        if(value >= 4) this.distance++;
    }
}
