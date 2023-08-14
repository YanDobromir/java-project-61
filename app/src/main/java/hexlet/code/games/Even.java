package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Even {
    public static final String GAMERULEONE = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static String getLogics(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
    public static void even() {
        int number;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = Util.gameRandome(MAX_RANDOM_NUMBERS);  // генерируем случайное число
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем число
            numberAndcorectAnswer[i][1] = getLogics(number);
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer); // call the engine
    }
}

