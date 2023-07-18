package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
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
    public static int truthAnswer(char x, int a, int b) {
        if (x == '+')
            return a + b;
        else if (x == '-')
            return a - b;
        else
            return a * b;
    }
    public static void gamenumbethree() {
        // приветствие
        Cli.getUserName();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        Random rand = new Random();
        System.out.println("What is the result of the expression?");

        // логика игры
        boolean finishGame = true;
        int corectanswer;
        for (int i = 0; i < 3; i++) {
            char operator = generateRandomeOperator();
            int numberOne = (rand.nextInt(9) + 1);
            int numberTwo = (rand.nextInt(9) + 1);


            System.out.println("Question: " + numberOne + operator + numberTwo);
            int answerUser = scanner.nextInt();
            System.out.println("Your answer: " + answerUser);

            corectanswer = truthAnswer(operator, numberOne, numberTwo);
            //устанавливаем значение для печати
            if (answerUser == corectanswer)
                System.out.println("Correct!");
            else {
                System.out.println("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'" + corectanswer + "'" + "\nLet's try again, " + userName + "!");
                finishGame = false;
                break;
            }
        }
            if (finishGame)
                System.out.println("Congratulations, " + userName + "!");


        }

    }




