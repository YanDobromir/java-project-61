package hexlet.code;
import java.util.Scanner;
public class App {
    public static int getIntfromString(String choiseUserString) {
        if (choiseUserString.equalsIgnoreCase("0")) {
            return 0;
        } else if (choiseUserString.equalsIgnoreCase("1")) {
            return 1;
        } else if (choiseUserString.equalsIgnoreCase("2")) {
            return 2;
        } else if (choiseUserString.equalsIgnoreCase("3")) {
            return 3;
        } else if (choiseUserString.equalsIgnoreCase("4")) {
            return 4;
        } else if (choiseUserString.equalsIgnoreCase("5")) {
            return 5;
        } else if (choiseUserString.equalsIgnoreCase("6")) {
            return 6;
        } else {
            return 400;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(1 + " - Greet");
        System.out.println(2 + " - Even");
        System.out.println(3 + " - Calc");
        System.out.println(4 + " - GCD");
        System.out.println(5 + " - Progression");
        System.out.println(6 + " - Prime");
        System.out.println("0 - Exit");
        String choiseUserString = scanner.next(); //ChoiseUser
        System.out.println("Your choice: " + choiseUserString);
        int choiseUser = getIntfromString(choiseUserString);
        if (choiseUser == 0) {
            System.exit(0);
        } else if (choiseUser > 6) {
            System.out.println("Your chois is not correct!");
            System.exit(0);
        }
        Cli.welcome();
        String userName = Cli.getUserName();
        System.out.println("Hello, " + userName + "!");
        Engine.logikaMenu(choiseUser, userName);
    }
}

