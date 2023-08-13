package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;

import static hexlet.code.Engine.QUANTITYGAMES;
public class Progression {
    public static final String GAME_FIVE_RULE = ("What number is missing in the progression?");
    public static final int NUMBERS = 8; //Quantity numbers for progression
    private static final int MAX_STEP = 10; //Max step
    public static void progression() {
        int sum = 0;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        String[] numbers = new String[NUMBERS];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            int numberStep = Util.gameRandome(MAX_STEP); // Шаг
            int notNumber = Util.gameRandome((NUMBERS) - 1); // отсутствующее число
            sum = sum + numberStep;
            for (int r = 0; r < NUMBERS; r++) {
                numbers[r] = Integer.toString(sum); // записываем число
                if (r == notNumber) {
                    numbers[r] = "..";
                    numberAndcorectAnswer[i][0] = Util.stringList(numbers);
                    numberAndcorectAnswer[i][1] = numberAndcorectAnswer[i][r];

                }
            }
        }
        Engine.engineWorks(GAME_FIVE_RULE, numberAndcorectAnswer); // вызываем движок
    }
}








