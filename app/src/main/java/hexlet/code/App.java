package hexlet.code;
import java.util.Scanner;
public class App {

    public static String getIntfromString(String choiseUserString) {
        String[] choiseUserCorectOrnot = {"0", "1", "2", "3", "4", "5", "6"};
        for (int i = 0; i < choiseUserCorectOrnot.length; i++) {
            if (choiseUserString.equalsIgnoreCase(choiseUserCorectOrnot[i])) {
                return choiseUserCorectOrnot[i];
            }
        }
        return "!";
    }


    public static void main(String[] args) {
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
        String correctChoise = getIntfromString(choiseUserString);
        if (correctChoise.equalsIgnoreCase("0")) {
            System.exit(0);
        } else if (correctChoise.equalsIgnoreCase("!")) {
            System.out.println("Your chois is not correct!");
            System.exit(0);
        }

        Cli.welcome();
        String userName = Cli.getUserName();
        System.out.println("Hello, " + userName + "!");
        Engine.logikaMenu(choiseUserString, userName);
    }
}

