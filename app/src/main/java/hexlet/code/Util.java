package hexlet.code;
import java.util.Random;
public class Util {
    public static int getRandomeNumber(int number) {
        Random rand = new Random();
        return (rand.nextInt(number) + 1);
    }
}

