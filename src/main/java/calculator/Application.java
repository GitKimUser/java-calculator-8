package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        int result = 0;
        StringCalculator calculator = new StringCalculator();

        result = calculator.add(input);

        System.out.printf("결과 : %d\n", result);
    }
}

class StringCalculator {
    public int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] tokens;
        if (text.startsWith("//") && text.contains("\\n")) {
            // 커스텀 구분자 처리 로직 (위의 3단계 접근법)
            int newlineIndex = text.indexOf("\\n");
            String customDelimiter = text.substring(2, newlineIndex);
            String numbersText = text.substring(newlineIndex + 2);
            tokens = numbersText.split(customDelimiter);
            System.out.println("Tokens: " + java.util.Arrays.toString(tokens));
            
        } else {
            // 기본 구분자 처리 로직
            tokens = text.split("[,:]");
            System.out.println("Tokens: " + java.util.Arrays.toString(tokens));
        }
        
        // 합산 로직은 여기서 한 번만 실행!
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
