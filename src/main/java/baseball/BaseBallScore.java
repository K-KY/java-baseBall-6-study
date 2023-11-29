package baseball;

public enum BaseBallScore {
    BALL("볼"), STRIKE("스트라이크");

    private String score;

    BaseBallScore(String score) {
        this.score = score;
    }

    public static boolean isBall(String score) {
        return score.equals(BALL.score);
    }

    public static boolean isStrike(String score) {
        return score.equals(STRIKE.score);
    }
}
