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

            System.out.println("Scientific Calculator... \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Natural Log\n4. Power\n" +
                    "5. Exit\nEnter your choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a number : ");
                    try {
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input entered.. Please enter number");
                        logger.info("Invalid Input! Closing Application");
                        return;
                    }
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;

                case 2:

                    System.out.print("Enter a number : ");
                    try {
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input entered.. Please enter number");
                        logger.info("Invalid Input! Closing Application");
                        return;
                    }
                    System.out.println("Square root of " + number1 + " is : " + calculator.squareRoot(number1));
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    try {
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input entered.. Please enter number");
                        logger.info("Invalid Input! Closing Application");
                        return;
                    }
                    System.out.println("Natural Log " + number1 + " is : " + calculator.naturalLog_Function(number1));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Enter the number : ");
                    try {
                        number1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        System.out.println("Invalid input entered.. Please enter number");
                        logger.info("Invalid Input! Closing Application");
                        return;
                    }

                    System.out.print("Enter exponent: ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);

    }

    public double factorial(double number1) {
        logger.info("Factorial calculation");
//        logger.info("[FACTORIAL] - " + number1);

        double result = fact(number1);
//        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double fact(double num) {
        double ans = 1;
        for (int i = 1; i <= num; ++i) {
            ans *= i;
        }
        return ans;
    }
    public double power(double number1, double number2) {
        logger.info("Power calculation");
//        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
//        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public static double naturalLog_Function(double number1){
        logger.info("NaturalLog calculation");
//        logger.info("[NATURAL LOG] - " + number1);
        double ans = Math.log(number1);
//        logger.info("[RESULT - NATURAL LOG] - "+ ans);
        return ans;
    }
    public double squareRoot(double number1) {
//        logger.info("[SQ ROOT] - " + number1);
        logger.info("SquareRoot calculation");
        double result = Math.sqrt(number1);
//        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
}
