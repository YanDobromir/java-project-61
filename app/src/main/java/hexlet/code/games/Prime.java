package hexlet.code.games;

public class Prime {
    public static String prime(int q) {
        boolean result = true;
        for (int i = 2; i < q; i++) {
            if (q % i == 0) {
                result = false;
                break;
            }
        }
        return (result) ? "yes" : "no";
    }
}
