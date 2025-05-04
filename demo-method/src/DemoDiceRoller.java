// 4-May-2025
// Dice Roller Program

import java.util.Random;
import java.util.Scanner;

public class DemoDiceRoller {
  public static void main (String[] args){

    // Java dice roller program

    Scanner scanner = new Scanner (System.in);
    Random random = new Random();

    // Declare variables
    int numOfDice;
    int total = 0;

    // Get # of dice from the user
    System.out.print("Enter the number of dice to roll: ");
    numOfDice = scanner.nextInt();
    
    // Check if # of dice > 0
    if (numOfDice > 0) {
    // Roll all the dice
      for (int i = 0; i < numOfDice; i++){
        int roll = random.nextInt(1,7);
        printDie(roll);
        System.out.println("You rolled: " + roll);
    // Get the total
        total = total + roll;
      }
      System.out.println("Total: " + total);
    }
    else {
      System.out.println("# of dice must be greater than 0");
    }

    scanner.close();
  }
  // Display ASCII of dice
  static void printDie(int roll){

    String dice1 = """
             -------
            |       |
            |   x   |
            |       |
             -------
                """;;

    //System.out.println(dice1);

    String dice2 = """
              -------
             |x      |
             |       |
             |      x|
              -------
                 """;;
 
    //System.out.println(dice2);
      
    String dice3 = """
              -------
             |x      |
             |   x   |
             |      x|
              -------
                 """;;
 
    //System.out.println(dice3);
  
    String dice4 = """
      -------
     |x     x|
     |       |
     |x     x|
      -------
         """;;

    //System.out.println(dice4);

    String dice5 = """
  -------
 |x     x|
 |   x   |
 |x     x|
  -------
     """;;

    //System.out.println(dice5);

    String dice6 = """
  -------
 |x     x|
 |x     x|
 |x     x|
  -------
     """;;

    //System.out.println(dice6);

    switch(roll){
      case 1:
      System.out.println(dice1);
      break;

      case 2:
      System.out.println(dice2);
      break;

      case 3:
      System.out.println(dice3);
      break;

      case 4:
      System.out.println(dice4);
      break;

      case 5:
      System.out.println(dice5);
      break;

      case 6:
      System.out.println(dice6);
      break;

      default:
      System.out.println("Invalid roll");
    }

  }
}
