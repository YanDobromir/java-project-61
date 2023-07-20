package hexlet.code;

import java.util.Scanner;

public class App {
    public static int chooseGames() {
        Scanner scanner = new Scanner(System.in);
        int gameOne = 1;
        int gameTwo = 2;
        int gameThree = 3;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameOne + " - Greet");
        System.out.println(gameTwo + " - Even");
        System.out.println(gameThree + " - Calc");
        System.out.println("0 - Exit");
        int election = scanner.nextInt();
        System.out.println("Your choice: " + election);
        return election;
    }
    public static void main(String[] args) {
        Engine.logikaGames();
        }
    }