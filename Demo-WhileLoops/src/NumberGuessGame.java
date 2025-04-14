//14-Apr-2025
// Number guessing game

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
  public static void main(String[] args) {
    
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int random_number = random.nextInt(min, max + 1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d\n", min, max);
    // % d 表示整数占位符，在输出时会被后面的 min 和 max 的值替换。

    do {
        System.out.print("Enter a guess: ");
        guess = scanner.nextInt();
        attempts++;

        if(guess < random_number){
          min = guess;
          System.out.println("Too low! Try a number between " + min + " and " + max);
        }
        else if (guess > random_number){
          max = guess;
          System.out.println("Too high! Try a number between " + min + " and " + max);
        }
        else{
          System.out.println("Correct! The number is " + random_number);
          System.out.println("# of attempts: " + attempts);
        }
    } while (guess != random_number);

    System.out.println("You have won");

    scanner.close();
  }
  
}
