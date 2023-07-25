package hexlet.code;
import java.util.Scanner;
public class Cli {

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

