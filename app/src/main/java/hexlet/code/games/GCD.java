package hexlet.code.games;

public class GCD {
    public static int calculateGCS(int a, int b) {
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

