package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;
public class Calc {
    private static final String GAMERULEONE = ("What is the result of the expression?");
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void playCalc() {
        Engine.engineWorks(GAMERULEONE, getGameData());
    }

    private static String[][] getGameData() {
        int number;
        int numberTwo;
        String operator;
        String[][] numberCorectAnswer = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            operator = OPERATORS[Util.getRandomeNumber(OPERATORS.length - 1)];
            number = (Util.getRandomeNumber(MAX_RANDOM_NUMBERS)); //number one
            numberTwo = Util.getRandomeNumber(MAX_RANDOM_NUMBERS); //number two
            numberCorectAnswer[i][0] = number + " " + operator + " " + numberTwo;
            numberCorectAnswer[i][1] = String.valueOf(calculate(number, numberTwo, operator));
        }
        return numberCorectAnswer;
    }

    private static int calculate(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                break;
        }
        return result;
    }
}
