package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;
public class Prime {
    public static final String GAMERULEONE = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static boolean gameLogik(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void prime() {
        int number;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = Util.gameRandome(MAX_RANDOM_NUMBERS); // генерируем случайное число
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем число
            numberAndcorectAnswer[i][1] = gameLogik(number) ? "yes" : "no";
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer); // вызываем движок
    }
}
