package baseball;

public class BaseballController {
    BaseballService baseballService;

    public BaseballController(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public boolean playGame(String input) {
        baseballService.validateInput(input);
        String answer = baseballService.generateRandomThreeDigitNumber();
        Score score = baseballService.countScore(answer, input);
        System.out.println(score);
        return true;
    }
}
