import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    sc.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        // Print without scientific notation
        System.out.printf("Result: %.2f\n", result);

        sc.close();
    }
}