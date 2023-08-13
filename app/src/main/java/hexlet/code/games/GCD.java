package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.QUANTITYGAMES;

import hexlet.code.Util;

public class GCD {
    public static final int NUMBERS = 2;
    public static final String GAMERULEONE = ("Find the greatest common divisor of given numbers."); // правило игры
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static int gameLogik(int a, int b) {
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
    public static void gcd() {
        int number;
        int numberTwo;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = Util.gameRandome(MAX_RANDOM_NUMBERS); // генерируем случайное число
            numberTwo = Util.gameRandome(MAX_RANDOM_NUMBERS); // генерируем случайное число
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем числа
            numberAndcorectAnswer[i][1] = Integer.toString(numberTwo); // записываем числа
            numberAndcorectAnswer[i][NUMBERS] = Integer.toString(gameLogik(number, numberTwo));

        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer); // вызываем движок
    }
}








