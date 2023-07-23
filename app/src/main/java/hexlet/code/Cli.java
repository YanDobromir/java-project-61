package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int chooseGames() {
        Scanner scanner = new Scanner(System.in);
        int gameOne = 1;
        int gameTwo = 2;
        int gameThree = 3;
        int gameFour = 4;
        int gameFive = 5;
        int gameSix = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameOne + " - Greet");
        System.out.println(gameTwo + " - Even");
        System.out.println(gameThree + " - Calc");
        System.out.println(gameFour + " - GCD");
        System.out.println(gameFive + " - Progression");
        System.out.println(gameSix + " - Prime");
        System.out.println("0 - Exit");
        int election = scanner.nextInt();
        System.out.println("Your choice: " + election);
        return election;
    }
}
