// Exercise 1 on 1-Apr-2025

public class ifstatements {
  public static void main(String[] args) {
    
    // if statement = performs a block of code if its condition is true

    int age = 0;

    if (age >=18) {
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
    
  }
}
