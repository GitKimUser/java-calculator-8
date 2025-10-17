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
    public int add(String text){
        if(text.isEmpty()){
            return 0;
        }
        String[] tokens = text.split("[,:]");
        int sum = 0;
        for(int i = 0 ; i < tokens.length; i++){
            sum += Integer.parseInt(tokens[i]);
        }

        return sum;
    }
}
