package baseball;

public class BaseballController {
    BaseballService baseballService;

    public BaseballController(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public boolean playGame(String number) {
        baseballService.validateInput(number);
        return true;
    }
}
