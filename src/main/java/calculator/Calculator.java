package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific Calculator..... \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n" +
                    "3. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is : " + calculator.squareRoot(number1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);

    }

    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double fact(double num) {
        double facto = 1;
        for (int i = 1; i <= num; ++i) {
            facto *= i;
        }
        return facto;
    }


    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
}
