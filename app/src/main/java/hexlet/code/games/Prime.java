package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Prime {
    private static final String GAMERULEONE = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static void playPrime() {
        Engine.engineWorks(GAMERULEONE, getGameData());
    }

    private static String[][] getGameData() {
        int number;
        boolean isPrime;
        String result;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // quantity games
            number = Util.getRandomeNumber(MAX_RANDOM_NUMBERS);
            isPrime = isPrime(number);
            result = isPrime ? "yes" : "no";
            numberAndcorectAnswer[i][0] = Integer.toString(number); //write number to array
            numberAndcorectAnswer[i][1] = result; //write correct answer to array
        }
        return numberAndcorectAnswer;
    }

    private static boolean isPrime(int number) {
        boolean result = true;
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return result;
    }

}
