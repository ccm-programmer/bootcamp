import java.util.Scanner;

public class JavaQuest4 {
  public static void main(String[] args) {

  /**
   * Exercise 1: Print 10 numbers: they must be even and > 0, and divisible by 3 (Search it from 0)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  // break , continue , for() , while() ,if() , %==0 , %!=0

  // int count = 0;
  // for (int i = 0; i < 100; i++){
  //   if (i % 2 == 0 && i % 3 == 0 && i > 0){
  //     System.out.print(i + " ");
  //     count++;
  //   }
  //   if (count == 10)
  //   break;
  // }
//6 12 18 24 30 36 42 48 54 60

    //Ex. 2 When target = 'c', the expected output:
    //We found 3 character c in the String

    //When target = 'z', the expected output:
    //Not Found
    Scanner input = new Scanner (System.in);
    System.out.println("please input a letter: ");
    String character = input.next();

    String str = "Welcome to the coding bootcamp";
    char target = 'c';
    int count = 0;
    //Use loop to count the target of character in a String
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == character.charAt(0)){
        count++;}
      }

      if (count > 0){
      System.out.println("We found " + count + " character " + character + " in the String");}
      else{
        System.out.println("Not Found");
      }
//We found 3 character c in the String


    //     String original = "Programming"; // The original string to be reversed
//     String reversed = "";            // An empty string to hold the reversed version

//     for (int i = original.length() - 1; i >= 0; i--) { // Loop from the end to the beginning of the string
//     char ch = original.charAt(i); // Get the character at the current index
//     reversed += ch;               // Append the character to the reversed string
// }

//     System.out.println("original String : " + original); // Print the original string
//     System.out.println("reversed String : " + reversed); // Print the reversed string
    





    //   //Ex. 3
    //   // for Loop to print first 15 numbers in Fibonacci Sequence
    //   // while loop to print first 15 numbers in Fibonacci Sequence
    //   // Expected result: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....


      /**
   * Expected output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
   * 
   */
  // Count the target of character in a String.
  
    // for loop to print first 15 numbers in Fibonacci Sequence
    // int count = 0;
    // int firstNumber = 0;
    // int secondNumber = 1;
    // System.out.print(firstNumber + " " + secondNumber + " ");

    // for (int i = 0; i < 500; i++) {
    //   int thirdNumber = firstNumber + secondNumber;
    //   System.out.print(thirdNumber + " ");
    //   firstNumber = secondNumber;
    //   secondNumber = thirdNumber;
    //   count++;
    //   if (count > 12)
    //     break;
    // }
    
    // // Approach 2
    // // while loop to print first 15 numbers in Fibonacci Sequence
    // count = 15;
    // firstNumber = 0;
    // secondNumber = 1;
    // int i = 0;
    // System.out.println();
    // System.out.print(firstNumber + " " + secondNumber + " ");
    // while (i < 13) {
    //   int thirdNumber = firstNumber + secondNumber;
    //   System.out.print(thirdNumber + " ");
    //   firstNumber = secondNumber;
    //   secondNumber = thirdNumber;
    //   i++; // when i =14 ,  while loop is finish
    // }

            //   int n = 15;
    //   int [] Fibonacci =  new int [n];
      
    //   Fibonacci[0] = 0;
    //   Fibonacci [1] = 1;
    //   System.out.println(Fibonacci[0]);
    //   System.out.println(Fibonacci[1]);

    //   for (int i = 2; i < n; i++){
    //     Fibonacci [i] = Fibonacci [i-1] + Fibonacci [i-2];
              
    //   System.out.println(Fibonacci[i]);}
      //from poe


      

    








  }
}
