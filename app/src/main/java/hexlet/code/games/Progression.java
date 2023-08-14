package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Util;

import static hexlet.code.Engine.QUANTITYGAMES;
public class Progression {
    public static final String GAME_FIVE_RULE = ("What number is missing in the progression?"); //rule for game
    public static final int NUMBERS = 8; //Quantity numbers for progression
    private static final int MAX_STEP = 10; //Max step
    public static String progressionlogics(int step, int notNumber, int start) {
        int sum = start; //number for start progression
        int correctAnswer = 0;
        for (int r = 0; r < NUMBERS; r++) {
            sum = sum + step;
            if (r == notNumber) {
                correctAnswer = sum;
            }
        }
        return String.valueOf(correctAnswer);
    }

    public static void progression() {
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { //quantity games
            int numberStep = Util.gameRandome(MAX_STEP); //Step
            int notNumber = Util.gameRandome((NUMBERS) - 1); //
            int start = Util.gameRandome(100); //start number for progression
            int sum = start;
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
            numberAndcorectAnswer[i][1] = progressionlogics(numberStep, notNumber, start);
        }
        Engine.engineWorks(GAME_FIVE_RULE, numberAndcorectAnswer); //call the engine
    }
}








