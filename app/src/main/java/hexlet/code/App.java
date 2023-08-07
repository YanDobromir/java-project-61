package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1" + " - Greet");
        System.out.println("2" + " - Even");
        System.out.println("3" + " - Calc");
        System.out.println("4" + " - GCD");
        System.out.println("5" + " - Progression");
        System.out.println("6" + " - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choiseUserString = scanner.next();
        switch (choiseUserString) {
            case "1":
                Cli.welcome();
                break;
            case "2":
                userName = Cli.welcome();
                Even.gameLogik(userName);
                break;
            case "3":
                userName = Cli.welcome();
                Calc.gameLogik(userName);
                break;
            case "4":
                userName = Cli.welcome();
                GCD.gameLogik(userName);
                break;
            case "5":
                userName = Cli.welcome();
                Progression.progression(userName);
                break;
            case "6":
                userName = Cli.welcome();
                Prime.gameLogik(userName);
                break;
            default:
                System.exit(0);
        }
    }
}

