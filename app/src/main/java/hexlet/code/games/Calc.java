package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;
public class Calc {
    public static final String GAMERULEONE = ("What is the result of the expression?"); //game rule
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final String[] OPERATORS = {"+", "-", "*"};
    public static String gameLogics(int num1, int num2, String operator) {
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
        String[][] numberCorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // quantity games
            operator = OPERATORS[Util.gameRandome(OPERATORS.length - 1)]; //operator
            number = (Util.gameRandome(MAX_RANDOM_NUMBERS)); //number one
            numberTwo = Util.gameRandome(MAX_RANDOM_NUMBERS); //number two
            numberCorectAnswer[i][0] = number + " " + operator + " " + numberTwo;
            numberCorectAnswer[i][1] = gameLogics(number, numberTwo, operator);

        }
        Engine.engineWorks(GAMERULEONE, numberCorectAnswer); // call the engine
    }

}
