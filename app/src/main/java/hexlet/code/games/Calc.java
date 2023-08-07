package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.CORRECTANSWER;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Calc {
    public static final int NUMBERS_OPERATOR = 3;
    public static final String GAMERULEONE = ("What is the result of the expression?"); // правило игры
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static char getArandomOperator() {
        Random rand = new Random();
        char[] operator = {'+', '-', '*'};
        var operatorChoise = (rand.nextInt(operator.length));
        return operator[operatorChoise];
    }
    public static String charToString(char ch) {
        return  new String(new char[]{ch});
    }

    public static int truthAnswer(char x, int a, int b) {
        if (x == '+') {
            return a + b;
        } else if (x == '-') {
            return a - b;
        } else {
            return a * b;
        }
    }
    public static void gameLogik(String username) {
        Random rand = new Random();
        int number;
        int numberTwo;
        char operator;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][NUMBERS_OPERATOR + CORRECTANSWER];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = (rand.nextInt(MAX_RANDOM_NUMBERS)); // генерируем случайное число
            operator = getArandomOperator();
            numberTwo = (rand.nextInt(MAX_RANDOM_NUMBERS) + 1); // генерируем случайное число
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем число
            numberAndcorectAnswer[i][1] = charToString(operator); // записываем оператор
            numberAndcorectAnswer[i][2] = Integer.toString(numberTwo); // записываем второе число
            numberAndcorectAnswer[i][NUMBERS_OPERATOR] = Integer.toString(truthAnswer(operator, number, numberTwo));

        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer, username, NUMBERS_OPERATOR); // вызываем движок
    }

}
