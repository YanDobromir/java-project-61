package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import static hexlet.code.Engine.QUANTITYGAMES;

public class Progression {
    private static final String GAME_FIVE_RULE = ("What number is missing in the progression?"); //rule for game
    private static final int NUMBERS = 8; //Quantity numbers for progression
    private static final int MAX_STEP = 10;
    private static final int MAX_START = 100;

    public static void playProgression() {
        Engine.engineWorks(GAME_FIVE_RULE, getGameData());
    }

    private static String[][] getGameData() {
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { //quantity games
            int numberStep = Util.getRandomeNumber(MAX_STEP); //Step
            int notNumber = Util.getRandomeNumber((NUMBERS) - 1); //missing number
            int start = Util.getRandomeNumber(MAX_START); //start number for progression
            int sum = start;
            String[] progression = getProgression(numberStep, start);
            var result = new StringBuilder(); // create question
            for (int r = 0; r < NUMBERS; r++) {
                sum = sum + numberStep;
                if (r == notNumber) {
                    result.append("..");
                    result.append(" ");
                } else {
                    result.append(sum);
                    result.append(" ");
                }
            }
            numberAndcorectAnswer[i][0] = result.toString();
            numberAndcorectAnswer[i][1] = progression[notNumber];
        }
        return numberAndcorectAnswer;
    }

    private static String[] getProgression(int step, int start) {
        int sum = start; //number for start progression
        String[] getProgression = new String[NUMBERS];
        for (int r = 0; r < NUMBERS; r++) {
            sum = sum + step;
            getProgression[r] = Integer.toString(sum);

        }
        return getProgression;
    }
}








