import java.util.Scanner;

public class Exercise1019b{
public static void main(String[] args) {
  /** 
   *Question : Write a Java program that reads a string from the user
   * 
   * and checks if it is a palindrome.
   * 
   * A palindrome is a string that reads the same forward and backward,
   * 
   * ignoring spaces and case.
   * 
   * Example 1 : Racecar -> "Racecar" is a palindrome.
   * 
   * Example 2 : Hello -> "Hello" is not a palindrome. since "olleh" 
   * 
   * Example 3 : A man a plan a canal Panama- > "A man a plan a canal Panama" is a palindrome.
   */

   Scanner scanner = new Scanner(System.in);
   System.out.println("Pleae input:  ");
   String input = scanner.nextLine().trim().toLowerCase();
   boolean palindrome = false;
   

   for(int i = 0; i < input.length() / 2; i++){
    if (input.charAt(i) == input.charAt (input.length()-i-1)){
      palindrome = true;
      break;
    }    }
    
   if (!palindrome) {
      System.out.println("\"" + input + " is not a palindrome.");
    } else{
      System.out.println("\"" + input + " is a palindrome.");}

      

  }
}





