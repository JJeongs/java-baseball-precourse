package baseball;

import camp.nextstep.edu.missionutils.Console;

public class BaseballView {
    private final BaseballController baseballController;

    public BaseballView(BaseballController baseballController) {
        this.baseballController = baseballController;
    }

    public void startGame() {
        boolean isFinished = false;
        while (!isFinished) {
            System.out.print("숫자를 입력해주세요 : ");
            String number = Console.readLine();
            isFinished = baseballController.playGame(number);
        }
    }
}
