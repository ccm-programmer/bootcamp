// Exercise 4 on 1-Apr-2025
// Shopping cart program

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price = 0;
        int quantity = 0;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        while (true) {
            try {
                System.out.print("What is the price for each?: ");
                price = scanner.nextDouble();
                if (price > 0) {
                    break;
                } else {
                    System.out.println("Price must be a positive number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // 清除无效输入
            }
        }

        while (true) {
            try {
                System.out.print("How many would you like?: ");
                quantity = scanner.nextInt();
                if (quantity > 0) {
                    break;
                } else {
                    System.out.println("Quantity must be a positive integer. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // 清除无效输入
            }
        }

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
