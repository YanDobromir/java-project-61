package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.CORRECTANSWER;
import static hexlet.code.Engine.QUANTITYGAMES;

public class GCD {
    public static int calculateGCS(int a, int b) {
        int nod = 1;
        int min;
        min = Math.min(a, b);
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    public static final int NUMBERS = 2;

    public static final String GAMERULEONE = ("Find the greatest common divisor of given numbers."); // правило игры
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static void gameLogik(String username) {
        Random rand = new Random();
        int number;
        int numberTwo;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][NUMBERS + CORRECTANSWER];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = (rand.nextInt(MAX_RANDOM_NUMBERS) + 1); // генерируем случайное число
            numberTwo = (rand.nextInt(MAX_RANDOM_NUMBERS) + 1); // генерируем случайное число
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем числа
            numberAndcorectAnswer[i][1] = Integer.toString(numberTwo); // записываем числа
            numberAndcorectAnswer[i][NUMBERS] = Integer.toString(calculateGCS(number, numberTwo));

        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer, username, NUMBERS); // вызываем движок
    }
}








