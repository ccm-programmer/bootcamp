//Exercise 2 的進階版本
//Excercise 3 on 1-Apr-2025
//MAD LIBS GAME

import java.util.Scanner;

public class MadLibsGameCont {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String adjective1 = getInput (scanner, "Enter an adjective (description): ");
    String noun1 = getInput (scanner, "Enter an noun (description): ");
    String adjective2 = getInput (scanner, "Enter an adjective (description): ");
    String verb1 = getVerbInput (scanner, "Enter a verb end with -ing (action): ");
    String adjective3 = getInput (scanner, "Enter an adjective (description): ");

    System.out.println("Today I went to a " + adjective1 + " zoo");
    System.out.println("In an exhibit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");

    scanner.close();
  }

    private static String getInput(Scanner scanner, String prompt) {
      System.out.print(prompt);
      return scanner.nextLine();
  }

  private static String getVerbInput(Scanner scanner, String prompt) {
    String verb;
    while (true){
      verb = getInput(scanner, prompt);
      if (verb.endsWith("ing")){
        break;
      }   else {
          System.out.println("Please enter the verb endsWith -ing");
        }
      }
    return verb;
}
  }

