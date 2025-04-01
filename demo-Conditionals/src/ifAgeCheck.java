// Exercise 5 on 1-Apr-2025

import java.util.Scanner;

public class ifAgeCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // if statement = performs a block of code if its condition is true

    String name;
    int age;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    
    System.out.print("Are you a Student (true/ false): ");
    isStudent = scanner.nextBoolean();

// Group 1
    if (name.isEmpty()){
      System.out.println("You didn't enter your name!");
    }
    else{
      System.out.println("Hello, " + name + "!");
    }

// Group 2
    if (age >=65) {
      System.out.println("You are a senior!");
    }

    else if (age >=18) {
      System.out.println("You are an adult!");
    }

    else if (age < 0) {
      System.out.println("You haven't born yet!");
      }
    
    else if (age == 0) {
      System.out.println("You are a baby!");
      }
    else {
      System.out.println("You are a child.");
      }

// Group 3
  if (isStudent){
    System.out.println("You are a student!");
  }
    else {
      System.out.println("You are not a student!"); 
  }
    scanner.close() ;
  }
}
