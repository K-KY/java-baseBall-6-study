package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {

    private static final String INPUT_BALL_NUMBER = "숫자를 입력해주세요 : ";
    private static final String GAME_END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n";
    private static final String END_OR_RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String REGEX = "";

    public List<Integer> ballNumber() {
        System.out.print(INPUT_BALL_NUMBER);
        String input = Console.readLine();
        List<String> userInput = new ArrayList<>(List.of(input.split(REGEX)));
        userInput.forEach(NumberValidator::isNumber);
        return userInput.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    public int endOrRestart() {
        System.out.println(GAME_END
                + END_OR_RESTART);
        String input = Console.readLine();
        int number = NumberValidator.isNumber(input);
        NumberValidator.isInRange(number);
        return number;
    }
}
