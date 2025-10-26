package racingcar;

public class Application {
    public static void main(String[] args) {
        Input input = InputManager.getInput();

        GameManager gm = new GameManager(input);

        gm.start();
    }
}
