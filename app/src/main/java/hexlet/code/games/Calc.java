package hexlet.code.games;
public class Calc {
    public static int truthAnswer(char x, int a, int b) {
        if (x == '+') {
            return a + b;
        } else if (x == '-') {
            return a - b;
        } else {
            return a * b;
        }
    }
}
