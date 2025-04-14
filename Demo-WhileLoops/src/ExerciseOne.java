// 14-Apr-2025

import java.util.Scanner;

public class ExerciseOne {
  public static void main(String[] args) {
    
    // while loop = repeat some code forever
    //            = while some condition remains true

    Scanner scanner = new Scanner(System.in);

    String name = "";

    while (name.isEmpty()){
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }

    System.out.println("Hello " + name);

    String response = "";

    while (!response.equals("Q")){
      System.out.println("You are playing a game");
      System.out.print("Press Q to quit ");
      response = scanner.next().toUpperCase();
    }

    System.out.println("You have quit the game");

    int age = 0;

    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    while (age < 0){
      System.out.println("Your age can't be negative");
      System.out.print("Enter your age: ");
      age = scanner.nextInt();
    }
// 另一種寫法
    // do {
    //   System.out.println("Your age can't be negative");
    //   System.out.print("Enter your age: ");
    //   age = scanner.nextInt();
    // } while (age < 0);
    

    System.out.println("You are " + age + " years old");

    scanner.close();
  }
  
}
