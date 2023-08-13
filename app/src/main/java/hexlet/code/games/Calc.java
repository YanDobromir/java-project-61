package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Calc {
    public static final String GAMERULEONE = ("What is the result of the expression?");
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final String[] OPERATORS = {"+", "-", "*"};
    public static String gameLogik(int num1, int num2, String operator) {
        var result = 0;
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
        return String.valueOf(result);
    }



    public static void calc() {
        int number;
        int numberTwo;
        String operator;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            operator = OPERATORS[Util.gameRandome(OPERATORS.length - 1)];
            number = (Util.gameRandome(MAX_RANDOM_NUMBERS)); // генерируем случайное число
            numberTwo = Util.gameRandome(MAX_RANDOM_NUMBERS); // генерируем второе случайное число
            numberAndcorectAnswer[i][0] = number + " " + operator + " " + numberTwo;
            numberAndcorectAnswer[i][1] = gameLogik(number, numberTwo, operator);

        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer); // вызываем движок
    }

}
