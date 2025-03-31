import java.util.Random;
import java.util.Scanner;

public class Ex3_Random {
  public static void main (String[] args){

  /*
   * 
   * Number Guessing Game
   * 
   * Write a Java program where the user tries to guess a randomly generated number
   * 
   * between 1 and 100. The program should:
   * 
   * 1. Randomly generate a number between 1 and 100.
   * 
   * 2. Prompt the user to guess the number.
   * 
   * 3. Indicate whether the guess is too high, too low, or correct.
   * 
   * 4. Continue asking for guesses until the user guesses the correct number.
   * 
   */

   Scanner scanner = new Scanner (System.in);
   
   Random random = new Random();

   int targetnumber = random.nextInt(100)+1;

   int guess = 0;
   int lowerBound = 0;
   int higherBound = 100;

   do {
    System.out.println("Guess a number between " + lowerBound + " and " + higherBound + ".");
    guess = scanner.nextInt();

    if (guess > targetnumber) {
      higherBond = guess;
      System.out.println("Too high , Try a number between " + lowerBound + " and " + higherBound);
    } else if (guess < targetnumber) {
      lowerBound = guess;
      System.out.println("Too low , Try a number between " + lowerBound + " and " + higherBound);
    } else {
      System.out.println("Correct! The number is " + targetnumber);
    }
  } while (guess != targetnumber);
  
  scanner.close();
















  }
}
