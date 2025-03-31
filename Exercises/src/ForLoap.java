public class ForLoap {
  public static void main(String[] args) {
    
    //Ex. 1
    // Objective: Practice for-loop, charAt() , if-else, and String manipulation
    // Task: Write a program that takes a string input from the user
    // and prints all the vowels (a, e, i, o, u) present in the string using a for-loop
    // and if-else. Ensure both uppercase and lowercase
    // vowels are considered.

    String inputString = "Java Programming";

    //Approach 1
    for (int i = 0; i < inputString.length(); i++){
      char ch = inputString.charAt(i);
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'||
      ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        System.out.print(ch + " ");
      }} //a a o a i

      System.out.println(" ");

      //Approach 2
      char[] vowels = new char[] {'A', 'E', 'I', 'O', 'U', 'a','e','i','o','u'};
      for (int i = 0; i < inputString.length(); i++){
        for (int j = 0; j < vowels.length; j++){
          if (inputString.charAt(i) == vowels[j]){
            System.out.print(inputString.charAt(i) + " "); //a a o a i
          }
        }
      }

      System.out.println(" ");

      //Approach 3
      String vowels2 = "aeiou";
      for (int i = 0; i < inputString.length(); i++){
        for (int j = 0; j < vowels2.length(); j++){
          if (inputString.charAt(i) == vowels2.charAt(j) || 
          inputString.charAt(i) == vowels2.toUpperCase().charAt(j)){
            System.out.print(inputString.charAt(i) + " "); //a a o a i
          }
        }
      }

      System.out.println(" ");

      //Ex. 2
      //for loop to print first 15 numbers in Fibonacci Sequence
      //Expected output: 0, 1, 1, 2, 3, 5, 8...

      int count = 0;
      int firstnumber = 0;
      int secondnumber = 1;
      System.out.print(firstnumber + " ");
      System.out.print(secondnumber + " ");

      for (int i = 0; i < 500; i++){
        int thirdnumber = firstnumber + secondnumber;
        firstnumber = secondnumber;
        secondnumber = thirdnumber;
        System.out.print(thirdnumber + " ");
        count++;
        if(count > 12){
          break;
        }
      }

      
        
      
    }
  }
  
