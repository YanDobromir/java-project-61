package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Even {
    public static final String GAMERULEONE = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static void playEven() {
        Engine.engineWorks(GAMERULEONE, getGameData());
    }

    private static String[][] getGameData() {
        int number;
        boolean isEven;
        String result;
        String[][] numberAndcorectAnswer = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            number = Util.getRandomeNumber(MAX_RANDOM_NUMBERS);
            isEven = isEven(number);
            result = isEven ? "yes" : "no";
            numberAndcorectAnswer[i][0] = Integer.toString(number);
            numberAndcorectAnswer[i][1] = result;
        }
        return numberAndcorectAnswer;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

