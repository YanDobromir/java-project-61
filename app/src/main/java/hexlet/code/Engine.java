package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Random;
import java.util.Scanner;
public class Engine {
    //узнаем числа для игр
    public static int randome() {
        Random rand = new Random();
        return (rand.nextInt(150) + 1);
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
        String userName = Cli.getUserName(); //получаем имя
        int choose = App.chooseGames(); //узнаем выбор игры


        //number two
        boolean resultGames = true;
        for (int a = 0; a < 3; a++) {
            if (choose == 2) {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                int number = randome();
                printNumber(number);
                String answeUser = answerUser();
                printUserAnswer(answeUser);
                // вывод результата
                resultGames = (corectOrnotcorect(answeUser, printcorectAnswer(Even.gamenumberone(number)), userName));
                   if (resultGames == false) {
                       break;
                   }
            }
            //number three
            else if (choose == 3) {
                System.out.println("What is the result of the expression?");
                int numberOne = randome();
                int numberTwo = randome();
                char operator = generateRandomeOperator();
                printNumber(numberOne, numberTwo, operator);
                int answeUser = answerUserInt();
                printUserAnswer(answeUser);
                // вывод результата
                resultGames = (corectOrnotcorect(answeUser, Calc.truthAnswer(operator, numberOne, numberTwo), userName));
                    if (resultGames == false) {
                        break;
                    }
            }
        }
        if (resultGames)
            System.out.println("Congratulations, " + userName);


    }
    }