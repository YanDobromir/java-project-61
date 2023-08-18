package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int QUANTITYGAMES = 3;

    public static void engineWorks(String gameruleone, String[][] numberAndcorectAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameruleone);

        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            System.out.println("Question: " + numberAndcorectAnswer[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(numberAndcorectAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + numberAndcorectAnswer[i][1] + "'." + "\n" + "Let's try again, "
                        + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}











