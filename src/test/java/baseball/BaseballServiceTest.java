package baseball;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class BaseballServiceTest {

    private final BaseballService baseballService = new BaseballService();

    @Test
    void 숫자로_이루어져있지_않으면_잘못된_값() {
        assertSimpleTest(() -> assertThatThrownBy(() -> baseballService.validateInput("-12")).isInstanceOf(
                IllegalArgumentException.class));
    }

    @Test
    void 입력이_3글자가_아니면_잘못된_값() {
        assertSimpleTest(() -> assertThatThrownBy(() -> baseballService.validateInput("1234")).isInstanceOf(
                IllegalArgumentException.class));
    }

    @Test
    void zero_포함되어_있으면_잘못된_값() {
        assertSimpleTest(() -> assertThatThrownBy(() -> baseballService.validateInput("102")).isInstanceOf(
                IllegalArgumentException.class));
    }

    @Test
    void 숫자가_중복되면_잘못된_값() {
        assertSimpleTest(() -> assertThatThrownBy(() -> baseballService.validateInput("119")).isInstanceOf(
                IllegalArgumentException.class));
    }
}