package hexlet.code;
import java.util.Scanner;
public class App {
    public static int getIntfromString(String choiseUserString) {
        int choiseUserNamber;
        if (choiseUserString.equalsIgnoreCase("0")) {
            choiseUserNamber = 0;
            return choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("1")) {
            choiseUserNamber = 1;
            return choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("2")) {
            choiseUserNamber = 2;
            return  choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("3")) {
            choiseUserNamber = 3;
            return  choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("4")) {
            choiseUserNamber = 4;
            return  choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("5")) {
            choiseUserNamber = 5;
            return  choiseUserNamber;
        } else if (choiseUserString.equalsIgnoreCase("6")) {
            choiseUserNamber = 6;
            return  choiseUserNamber;
        } else {
            choiseUserNamber = 7;
            return  choiseUserNamber;
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
        System.out.print("Your choice: ");
        String choiseUserString = scanner.next(); //ChoiseUser
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

