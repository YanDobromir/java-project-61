package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Greet {
    public static void gamenumberone() {
        Cli.getUserName();
        String corectanswer;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {

            int number = (rand.nextInt(15) + 1);
            System.out.println("Question: " + number);
            String answerUser = scanner.next();
            System.out.println("Your answer: " + answerUser);
            boolean result = number % 2 == 0;
            if (!result) {
                corectanswer = "no";
            } else
                corectanswer = "yes";
            String correct = "Correct!";
            String nevercorect = answerUser + " is wrong answer ;(. Correct answer was " + corectanswer + "\nLet's try again, " + "Bob" + "!";
            if ((result) && (answerUser.equalsIgnoreCase("yes")))
                System.out.println(correct);
            else if ((!result) && (answerUser.equalsIgnoreCase("no")))
                System.out.println(correct);
            else {
                System.out.println(nevercorect);
                break;
            }

                System.out.println("Congratulations, Bill!");

        }

    }
}




