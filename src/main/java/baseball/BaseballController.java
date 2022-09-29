package baseball;

public class BaseballController {
    BaseballService baseballService;

    public BaseballController(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public boolean playGame(String number) {
        baseballService.validateInput(number);
        String answer = baseballService.generateRandomThreeDigitNumber();
        Score score = baseballService.countScore(answer, number);
        return true;
    }
}
