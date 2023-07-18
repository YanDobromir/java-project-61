package hexlet.code.games;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;
public class Greet {
    public static void gamenumberone() {
        boolean finishGame = true;
        Cli.getUserName();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        Random rand = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // логика игры
        String corectanswer;
        for (int i = 0; i < 3; i++) {
            int number = (rand.nextInt(150) + 1);
            // общение
            System.out.println("Question: " + number);
            String answerUser = scanner.next();
            System.out.println("Your answer: " + answerUser);
            //узнаем правильный результат
            boolean result = number % 2 == 0;
            //устанавливаем значение для печати
            if (!result) {
                corectanswer = "no";
            } else
                corectanswer = "yes";
            String correct = "Correct!";
            String nevercorect = "'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'" + corectanswer + "'" + "\nLet's try again, " + userName + "!";
            if ((result) && (answerUser.equalsIgnoreCase("yes")))
                System.out.println(correct);
            else if ((!result) && (answerUser.equalsIgnoreCase("no")))
                System.out.println(correct);
            else {
                System.out.println(nevercorect);
                finishGame = false;
                break;
            }
        }
        if (finishGame)
            System.out.println("Congratulations, " + userName + "!");
    }
}




