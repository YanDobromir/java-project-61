package hexlet.code.games;
public class Progression {
    public static int progression(int[] numbers, int step, int numbernot) {
        int truAnswer = 0;
        int sum = 0;
        for (int r = 0; r < numbers.length; r++) {
            sum = sum + step;
            numbers[r] = sum;
            if (r == numbernot) {
                truAnswer = numbers[r];
            }
        }
        return truAnswer;
    }
}

