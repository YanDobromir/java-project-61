package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Even {
    public static final String GAMERULEONE = ("Answer 'yes' if the number is even, otherwise answer 'no'.");
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static void isEven() {
        Engine.engineWorks(GAMERULEONE, getNumberAnswer()); // call the engine
    }
    private static boolean getCorrectAnswer(int num) {
        return num % 2 == 0;
    }
    private static String[][] getNumberAnswer() {
        int number;
        boolean isEven;
        String result;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            number = Util.getRandomeNumber(MAX_RANDOM_NUMBERS);  // генерируем случайное число
            isEven = getCorrectAnswer(number);
            result = isEven ? "yes" : "no";
            numberAndcorectAnswer[i][0] = Integer.toString(number); // записываем число
            numberAndcorectAnswer[i][1] = result;
        }
        return numberAndcorectAnswer;

    }
}

