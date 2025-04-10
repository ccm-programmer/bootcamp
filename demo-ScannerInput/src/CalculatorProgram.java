// 10-Apr-2025
// Calculator Program

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        boolean validOperator = true;
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
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}    