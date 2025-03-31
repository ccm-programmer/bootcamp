public class WhileLop {
  public static void main (String[] args){
    //Ex. 1
    // Task: Write a program that takes a string and a character as input,
    // and counts how many times the character occurs in the string using indexOf()
    // and a while-loop. Make sure to handle cases where the character is not found.
    
    String inputString = "programming";
    char targetChar = 'm'; // char -> ASCII -> int
    
    //Step 1:
    int count = 0;

    //Step 2: find the index of the input int/char
    //return -1 : if the character does not occur.
    int index = inputString.indexOf(targetChar);
    System.out.println(index); //6

    //Step 3: write while loop
    while (index != -1) {
      count++;
      index = inputString.indexOf(targetChar, index+1);
    }
    System.out.println("The character '" + targetChar + "' appears " + count + " times.");

       //Ex. 2
      //for loop to print first 15 numbers in Fibonacci Sequence
      //Expected output: 0, 1, 1, 2, 3, 5, 8...

      int i = 0;
      int firstnumber = 0;
      int secondnumber = 1;
      System.out.print(firstnumber + " ");
      System.out.print(secondnumber + " ");
      
      while (i <= 12){
        int thirdnumber = firstnumber + secondnumber;
        firstnumber = secondnumber;
        secondnumber = thirdnumber;
        System.out.print(thirdnumber + " ");
        i++;
      }





  }
}
