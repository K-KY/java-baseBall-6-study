package baseball.controller;

import baseball.BaseBallScore;
import baseball.ComputerNumbers;
import baseball.NumberGenerator;
import baseball.NumberValidator;
import baseball.UserInput;
import baseball.UserNumbers;
import baseball.view.OutputView;
import java.util.List;

public class BaseBallController {
    private static final String START_GAME = "숫자 야구 게임을 시작합니다.";
    private static final int END_POINT = 3;
    private static final int RESTART = 1;
    private static List<Integer> generatedNumber = NumberGenerator.generateNumber();

    public void start() {
        System.out.println(START_GAME);
        System.out.println(generatedNumber);
        UserInput userInput = new UserInput();
        process(userInput);
        int restart = userInput.endOrRestart();
        restart(restart);
    }

    private void process(UserInput userInput) {
        List<Integer> ballNumbers = userInput.ballNumber();
        validate(ballNumbers);
        List<String> scores = compareNumbers(ballNumbers);
        OutputView.printResult(scores);
        if (!isEnd(scores)) {
            process(userInput);
        }
    }

    private void validate(List<Integer> ballNumbers) {
        NumberValidator.isInRange(ballNumbers);
        NumberValidator.isDuplicate(ballNumbers);
        NumberValidator.isInAmount(ballNumbers);
    }

    private List<String> compareNumbers(List<Integer> ballNumbers) {
        ComputerNumbers computerNumbers = new ComputerNumbers(generatedNumber);
        UserNumbers userNumbers = new UserNumbers(ballNumbers);
        return userNumbers.score(computerNumbers);
    }

    private boolean isEnd(List<String> scores) {
        return scores.stream()
                .map(BaseBallScore::isStrike)
                .filter(result -> result)
                .count() == END_POINT;
    }

    private void restart(int restart) {
        if (restart == RESTART) {
            generatedNumber = NumberGenerator.generateNumber();
            start();
        }
    }
}
