package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserInput {

    public List<Integer> ballNumber() {
        String input = Console.readLine();
        List<String> userInput = new ArrayList<>(List.of(input.split("")));
        userInput.forEach(NumberValidator::isNumber);
        return userInput.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}
