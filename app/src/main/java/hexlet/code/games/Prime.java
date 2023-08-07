package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.CORRECTANSWER;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Prime {
    public static boolean prime(int q) {
        boolean result = true;
        for (int i = 2; i < q; i++) {
            if (q % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static final int NUMBERS = 1;

    public static final String GAMERULEONE = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static void gameLogik(String username) {
        Random rand = new Random();
        int number;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][NUMBERS + CORRECTANSWER];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            for (int r = 0; r < NUMBERS; r++) { // кол-во цифр
                number = (rand.nextInt(MAX_RANDOM_NUMBERS) + 1); // генерируем случайное число
                numberAndcorectAnswer[i][r] = Integer.toString(number); // записываем число
                numberAndcorectAnswer[i][NUMBERS] = prime(number) ? "yes" : "no";
            }
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer, username, NUMBERS); // вызываем движок
    }


}
