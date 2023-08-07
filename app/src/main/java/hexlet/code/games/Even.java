package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.CORRECTANSWER;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Even {
    public static final int NUMBERS = 1;

    public static final String GAMERULEONE = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static void gameLogik(String username) {
        Random rand = new Random();
        int number;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][NUMBERS + CORRECTANSWER];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            for (int r = 0; r < NUMBERS; r++) { // кол-во цифр
                number = (rand.nextInt(MAX_RANDOM_NUMBERS)); // генерируем случайное число
                numberAndcorectAnswer[i][r] = Integer.toString(number); // записываем число
                numberAndcorectAnswer[i][NUMBERS] = number % 2 == 0 ? "yes" : "no";
            }
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer, username, NUMBERS); // вызываем движок
    }
}
