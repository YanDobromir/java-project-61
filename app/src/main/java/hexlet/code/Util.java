package hexlet.code;
import java.util.Random;
public class Util {
    public static int gameRandome(int number) {
        Random rand = new Random();
        return  (rand.nextInt(number) + 1);
    }
    public static String stringList(String[] items) {
        var result = new StringBuilder();
        for (var item : items) {
            result.append(item);
            result.append(" ");
        }
        return result.toString();
    }
}
