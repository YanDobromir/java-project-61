package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;
public class Prime {
    public static final String GAMERULEONE = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;
    public static boolean gameLogics(int number) {
        boolean result = true;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return result;
    }
    public static void prime() {
        int number;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // quantity games
            number = Util.gameRandome(MAX_RANDOM_NUMBERS);
            numberAndcorectAnswer[i][0] = Integer.toString(number); //write number to array
            numberAndcorectAnswer[i][1] = gameLogics(number) ? "yes" : "no"; //write correct answer to array
        }
        Engine.engineWorks(GAMERULEONE, numberAndcorectAnswer); // call the engine
    }
}
