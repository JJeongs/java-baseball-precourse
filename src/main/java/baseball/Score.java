package baseball;

import java.util.Objects;

public class Score {
    private int ball;
    private int strike;

    public Score() {
        ball = 0;
        strike = 0;
    }

    public Score(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    @Override
    public String toString() {
        String result = "";
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        if (ball > 0) {
            result += (ball + "볼 ");
        }
        if (strike > 0) {
            result += (strike + "스트라이크");
        }
        return result.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Score score = (Score) o;
        return ball == score.ball && strike == score.strike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball, strike);
    }

    private void increaseBall() {
        this.ball++;
    }

    private void increaseStrike() {
        this.strike++;
    }

    public void increaseBallIfInDifferentPosition(String answer, String number, int position) {
        if (answer.charAt(position) == number.charAt(position)) {
            return;
        }
        if (answer.contains(Character.toString(number.charAt(position)))) {
            increaseBall();
        }
    }

    public void increaseStrikeInEqualPosition(String answer, String number, int position) {
        if (answer.charAt(position) == number.charAt(position)) {
            increaseStrike();
        }
    }
}
