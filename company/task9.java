package company;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        double number2 = value.nextDouble();

        System.out.println("Select an operation (+, -, *, /,^,%): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
               // result = number1 ^ number2;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }
    }
}
