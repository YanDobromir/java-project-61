package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Random;
import java.util.Scanner;
public class Engine {
    //get a random number
    public static int randome(int k) {
        Random rand = new Random();
        return (rand.nextInt(k) + 1);
    }
    //get a random operator
    public static char getArandomOperator() {
        Random rand = new Random();
        char[] operator = {'+', '-', '*'};
        var operatorChoise = (rand.nextInt(operator.length));
        return operator[operatorChoise];
    }
    //get answerUser
    public static void printUserAnswer(String answerUser) {
        System.out.println(answerUser);
    }
    public static void printUserAnswer(int answerUser) {
        System.out.println(answerUser);
    }

    //question tags
    public static void printNumber(int data) {
        System.out.println("Question: " + data);
        System.out.print("Your answer: ");
    }
    public static void printNumber(int data, int data2, char a) {
        System.out.println("Question: " + data + " " + a + " " + data2);
        System.out.print("Your answer: ");
    }

    public static void printNumber(int data, int data2) {
        System.out.println("Question: " + data + " " + data2);
        System.out.print("Your answer: ");
    }

    public static void printNumber(int[] data, int step, int numbernot) {
        System.out.print("Question: ");
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + step;
            data[i] = sum;
            if (i == numbernot) {
                System.out.print(".. ");
            } else {
                System.out.print(data[i] + " ");
            }
        }
    }

    //реакция программы на правильный либо не правильный ответ
    public static boolean corectOrnotcorect(String answerUser, String corectanswer, String userName) {
        boolean result = true;
        if (answerUser.equalsIgnoreCase(corectanswer)) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + corectanswer + "'" + "\nLet's try again, " + userName + "!");
            result = false;
        }
        return result;
    }

    public static boolean corectOrnotcorect(int answerUser, int corectanswer, String userName) {
        boolean result = true;
        if (answerUser == corectanswer) {
            System.out.println("Correct!");
        } else {
            System.out.print("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + corectanswer + "'" + "\nLet's try again, " + userName + "!");
            result = false;
        }
        return result;
    }

    public static void logikaMenu(String choiseUser, String userName) {
        Scanner scanner = new Scanner(System.in);
        boolean resultGames = true;
        var quantityGames = 3;
        var quantityNumberforGames = 100;
        var gameOne = "1";
        var gameTwo = "2";
        var gameThree = "3";
        var gameFour = "4";
        var gameFive = "5";
        var gameSix = "6";


        for (int a = 0; a < quantityGames; a++) {
            if ((choiseUser.equalsIgnoreCase(gameOne))) {
                resultGames = false;
                break;
            }
            if (((choiseUser.equalsIgnoreCase(gameTwo)))) {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

                var quantityNumbers = 30;

                int number = randome(quantityNumbers);
                printNumber(number);
                String answeUser = scanner.next();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, Even.gamenumberone(number), userName));
                if (!resultGames) {
                    break;
                }
            } else if ((choiseUser.equalsIgnoreCase(gameThree))) {
                System.out.println("What is the result of the expression?");
                int numberOne = randome(quantityNumberforGames);
                int numberTwo = randome(quantityNumberforGames);
                char operator = getArandomOperator();
                printNumber(numberOne, numberTwo, operator);
                int answeUser = scanner.nextInt();
                resultGames = (corectOrnotcorect(answeUser, Calc.truthAnswer(operator, numberOne, numberTwo),
                        userName));
                if (!resultGames) {
                    break;
                }
            } else if ((choiseUser.equalsIgnoreCase(gameFour))) {
                System.out.println("Find the greatest common divisor of given numbers.");
                int numberOne = randome(quantityNumberforGames);
                int numberTwo = randome(quantityNumberforGames);
                printNumber(numberOne, numberTwo);
                int answeUser = scanner.nextInt();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, GCD.calculateGCS(numberOne, numberTwo), userName));
                if (!resultGames) {
                    break;
                }
            } else if ((choiseUser.equalsIgnoreCase(gameFive))) {
                System.out.println("What number is missing in the progression?");

                var quantityNumbGameFive = 10;
                int numberStep = randome(quantityNumbGameFive); // Шаг

                int[] numbers = new int[quantityNumbGameFive];
                int numbernot = randome(numbers.length - 1);
                printNumber(numbers, numberStep, numbernot);
                int answeUser = scanner.nextInt();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, Progression.progression(numbers, numberStep, numbernot),
                        userName));
                if (!resultGames) {
                    break;
                }
            } else if ((choiseUser.equalsIgnoreCase(gameSix))) {
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                int numberOne = randome(quantityNumberforGames);
                printNumber(numberOne);
                String answeUser = scanner.next();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, Prime.prime(numberOne), userName));
                if (!resultGames) {
                    break;
                }
            }
        }
        if  (resultGames) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}




