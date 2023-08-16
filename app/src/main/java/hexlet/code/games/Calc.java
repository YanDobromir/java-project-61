package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;
public class Calc {
    private static final String GAMERULEONE = ("What is the result of the expression?"); //game rule
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void calculate() {
        Engine.engineWorks(GAMERULEONE, getNumberAnswer()); // call the engine
    }
    private static String[][] getNumberAnswer() {
        int number;
        int numberTwo;
        String operator;
        String[][] numberCorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // quantity games
            operator = OPERATORS[Util.getRandomeNumber(OPERATORS.length - 1)]; //operator
            number = (Util.getRandomeNumber(MAX_RANDOM_NUMBERS)); //number one
            numberTwo = Util.getRandomeNumber(MAX_RANDOM_NUMBERS); //number two
            numberCorectAnswer[i][0] = number + " " + operator + " " + numberTwo;
            numberCorectAnswer[i][1] = String.valueOf(giveCorrectAnswer(number, numberTwo, operator));
        }
        return numberCorectAnswer;
    }
    private static int giveCorrectAnswer(int num1, int num2, String operator) {
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
