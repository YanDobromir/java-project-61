package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

import static hexlet.code.Engine.CORRECTANSWER;
import static hexlet.code.Engine.QUANTITYGAMES;


public class Progression {
    public static final String GAMERULEONE = ("What number is missing in the progression?"); // правило игры
    public static final int NUMBERS = 8; // количество цифр
    private static final int MAX_STEP = 10;

    public static void progression(String username) {
        int sum = 0;
        Random rand = new Random();
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][NUMBERS + CORRECTANSWER];

        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            int numberStep = (rand.nextInt(MAX_STEP) + 1); // Шаг
            int notNumber = (rand.nextInt(NUMBERS) - 1); // отсутствующее число
            for (int r = 0; r < NUMBERS; r++) {
                sum = sum + numberStep;
                numberAndcorectAnswer[i][r] = Integer.toString(sum); // записываем число
                if (r == notNumber) {
                    numberAndcorectAnswer[i][NUMBERS] = numberAndcorectAnswer[i][r];
                    numberAndcorectAnswer[i][r] = "..";
                }
            }
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer, username, NUMBERS); // вызываем движок
    }
}








