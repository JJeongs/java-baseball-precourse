package baseball;

public class BaseballController {
    BaseballService baseballService;

    public BaseballController(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public boolean playGame(String input) {
        baseballService.validateNumber(input);
        String answer = baseballService.generateRandomThreeDigitNumber();
        Score score = baseballService.countScore(answer, input);
        System.out.println(score);
        if (baseballService.isGameEnded(score)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        return true;
    }
}
