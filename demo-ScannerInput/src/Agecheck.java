// Exercise 5 on 1-Apr-2025

import java.util.InputMismatchException;
import java.util.Scanner;

public class Agecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age = 0;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                if (age >= 0) {
                    break;
                } else {
                    System.out.println("Age cannot be negative. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // 清除无效输入
            }
        }

        while (true) {
            try {
                System.out.print("Are you a Student (enter 'true' or 'false'): ");
                isStudent = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
                scanner.nextLine(); // 清除无效输入
            }
        }

// Group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello, " + name + "!");
        }

// Group 2
        if (age >= 65) {
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child.");
        }

// Group 3
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
}