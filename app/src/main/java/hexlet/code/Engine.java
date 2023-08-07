package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int QUANTITYGAMES = 3;

    public static final int CORRECTANSWER = 1;
    public static void engineWorks(String gameruleone,
                                   String[][] numberAndcorectAnswer,  String username, int trhusfullAnswer) {
        Scanner scanner = new Scanner(System.in);
        boolean resultgame = true;
        System.out.print(gameruleone);
        for (int i = 0; i < QUANTITYGAMES; i++) { // кол-во игр
            System.out.print("Question: ");
            for (int r = 0; r < trhusfullAnswer; r++) { // кол-во цифр
                System.out.print(numberAndcorectAnswer[i][r] + (" "));
            }
            System.out.println(" ");
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(numberAndcorectAnswer[i][trhusfullAnswer])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + numberAndcorectAnswer[i][trhusfullAnswer] + "'." + "\n" + "Let's try again, "
                        + username + "!");
                resultgame = false;
                break;
            }
        }
        if (resultgame) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}











