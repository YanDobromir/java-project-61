package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Random;
import java.util.Scanner;
public class Engine {
    //узнаем числа для игр
    public static int randome(int k) {
        Random rand = new Random();
        return (rand.nextInt(k) + 1);
    }

    //генерируем оператор
    public static char generateRandomeOperator() {
        Random rand = new Random();
        int operator = (rand.nextInt(3) + 1);
        if (operator == 1)
            return '+';
        else if (operator == 2)
            return '-';
        else
            return '*';
    }

    //узнаем ответ пользователя
    public static String answerUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int answerUserInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    ////реакция программы на ответ пользователя
    public static void printUserAnswer(String answerUser) {
        System.out.println("Your answer: " + answerUser);
    }

    public static void printUserAnswer(int answerUser) {
        System.out.println("Your answer: " + answerUser);
    }

    //вопросы программы
    public static void printNumber(int data) {
        System.out.println("Question: " + data);
    }


    public static void printNumber(int data, int data2, char a) {
        System.out.println("Question: " + data + " " + a + " " + data2);
    }

    public static void printNumber(int data, int data2) {
        System.out.println("Question: " + data + " " + " " + data2);
    }

    public static void printNumberGameFour(int[] data, int step, int numbernot) {
        System.out.println("Question: ");
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + step;
            data[i] = sum;
            if (i == numbernot)
                System.out.print(" .. ");
            else
                System.out.print(data[i] + " ");
        }
    }

    // печатаем верный ответ
    public static String printcorectAnswer(boolean answer) {
        if (answer)
            return "yes";
        else
            return "no";
    }

    //реакция программы на правильный либо не правильный ответ
    public static boolean corectOrnotcorect(String answerUser, String corectanswer, String userName) {
        boolean result = true;
        if (answerUser.equalsIgnoreCase(corectanswer))
            System.out.println("Correct!");
        else {
            System.out.print("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'" + corectanswer + "'" + "\nLet's try again, " + userName + "!");
            result = false;
        }
        return result;
    }

    public static boolean corectOrnotcorect(int answerUser, int corectanswer, String userName) {
        boolean result = true;
        if (answerUser == corectanswer)
            System.out.println("Correct!");
        else {
            System.out.print("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'" + corectanswer + "'" + "\nLet's try again, " + userName + "!");
            result = false;
        }
        return result;
    }

    public static void logikaGames() {
        int choose = Cli.chooseGames(); //узнаем выбор игры
        String userName = Cli.getUserName(); //получаем имя

        if (choose == 0) { // если ответ не верный завершаем программу
            System.exit(0);
        }


        //number two
        boolean resultGames = true;
        for (int a = 0; a < 3; a++) {
            if (choose == 2) {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                int number = randome(30);
                printNumber(number);
                String answeUser = answerUser();
                printUserAnswer(answeUser);

                // вывод результата
                resultGames = (corectOrnotcorect(answeUser, printcorectAnswer(Even.gamenumberone(number)), userName));
                if (!resultGames) {
                    break;
                }
            }
            //number three
            else if (choose == 3) {
                System.out.println("What is the result of the n?");
                int numberOne = randome(100);
                int numberTwo = randome(100);
                char operator = generateRandomeOperator();
                printNumber(numberOne, numberTwo, operator);
                int answeUser = answerUserInt();
                // вывод результата
                resultGames = (corectOrnotcorect(answeUser, Calc.truthAnswer(operator, numberOne, numberTwo), userName));
                if (!resultGames) {
                    break;
                }
            } else if (choose == 4) {
                System.out.println("Find the greatest common divisor of given numbers.");
                int numberOne = randome(100);
                int numberTwo = randome(100);
                printNumber(numberOne, numberTwo);
                int answeUser = answerUserInt();
                printUserAnswer(answeUser);
                // вывод результата
                resultGames = (corectOrnotcorect(answeUser, GCD.calculateGCS(numberOne, numberTwo), userName));
                if (!resultGames) {
                    break;
                }
            } else if (choose == 5) {
                System.out.println("What number is missing in the progression?");
                int numberStep = randome(10);// Шаг;
                int[] numbers = new int[10];
                int numbernot = randome(numbers.length - 1);
                printNumberGameFour(numbers, numberStep, numbernot);
                int answeUser = answerUserInt();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, Progression.progression(numbers,numberStep,numbernot), userName));
                if (!resultGames) {
                    break;
                }

            }
            else if (choose == 6) {
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                int numberOne = randome(100);
                printNumber(numberOne);
                String answeUser = answerUser();
                printUserAnswer(answeUser);
                resultGames = (corectOrnotcorect(answeUser, printcorectAnswer(Prime.prime(numberOne)), userName));
                if (!resultGames) {
                    break;
                }




            }
            else
                System.exit(0);
        }
        if  (resultGames)
            System.out.println("Congratulations, " + userName);
    }
}




