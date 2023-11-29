package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {

    public List<Integer> ballNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        List<String> userInput = new ArrayList<>(List.of(input.split("")));
        userInput.forEach(NumberValidator::isNumber);
        return userInput.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    public int endOrRestart() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        int number = NumberValidator.isNumber(input);
        NumberValidator.isInRange(number);
        return number;
    }
}
