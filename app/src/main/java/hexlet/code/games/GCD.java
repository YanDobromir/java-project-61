package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.QUANTITYGAMES;
import hexlet.code.Util;

public class GCD {
    public static final String GAMERULEONE = ("Find the greatest common divisor of given numbers."); // правило игры
    private static final int MAX_RANDOM_NUMBERS = 20;

    public static void calculateGCD() {
        Engine.engineWorks(GAMERULEONE, getNumbersAnswer()); //call the engine
    }
    private static String[][] getNumbersAnswer() {
        int number;
        int numberTwo;
        String[][] numberAndcorectAnswer = new String[QUANTITYGAMES][2];
        for (int i = 0; i < QUANTITYGAMES; i++) { // quantity games
            number = Util.getRandomeNumber(MAX_RANDOM_NUMBERS); //number one
            numberTwo = Util.getRandomeNumber(MAX_RANDOM_NUMBERS); //number two
            numberAndcorectAnswer[i][0] = number + " " + numberTwo; //write numbers to array
            numberAndcorectAnswer[i][1] = Integer.toString(giveCorrectAnswer(number, numberTwo)); //write correct answer
        }
        return numberAndcorectAnswer;
    }
    private static int giveCorrectAnswer(int a, int b) {
        int nod = 1;
        int min;
        min = Math.min(a, b);
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

}








