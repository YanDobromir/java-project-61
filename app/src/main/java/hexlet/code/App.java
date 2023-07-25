package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
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
        int choiseUser = scanner.nextInt();
        System.out.println("Your choice: " + choiseUser);
        if (choiseUser > 6) { //if the user's choise is invalid, stop the game!
            System.out.println("Your choise is not correct!");
            System.exit(0);
        } else if (choiseUser == 0) {
            System.exit(0);
        }
        Cli.welcome();
        String userName = Cli.getUserName();
        System.out.println("Hello, " + userName + "!");
        if (choiseUser == 1) {
            System.exit(0);
        } else {
            Engine.logikaMenu(choiseUser);
        }
    }
}
