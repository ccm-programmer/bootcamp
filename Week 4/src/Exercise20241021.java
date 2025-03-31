import java.util.Arrays;

public class Exercise20241021 {
  public static void main (String[] args){

     // Exercise 1
//      String inputString = "programming";
//      char targetChar = 'a';
 
//       int count = 0;
//      // Objective : Practice : indexOf() , while-loop , if-else 
//      // Task: Write a program that takes a string and a character as input,
//      // and counts how many times the character occurs in the string using indexOf()
//      // and a while-loop. Make sure to handle cases where
//      // the character is not found.

//      for (int i = 0; i <= inputString.length()-1; i++){
//       if (inputString.charAt(i) == targetChar){
//         count++;
//       }
//      }
//      System.out.println(count);

//      //indexOf()
//      int index = inputString.indexOf(targetChar);
//      System.out.println(index); //5

//      //while loop
//      while (index != -1){
//       count++;
//       index = inputString.indexOf(targetChar, index + 1);
//      }
//      //System.out.println();


//       // Exercise 2
//     // Print Vowels in a String

//     // Objective: Practice for-loop, charAt() , if-else, and String manipulation
//     // Task: Write a program that takes a string input from the user
//     // and prints all the vowels (a, e, i, o, u) present in the string using a for-loop
//     // and if-else. Ensure both uppercase and lowercase
//     // vowels are considered.

//     // Example: Input string: "Java Programming". Output: a a o a i

//     String inputString2 = "Java Programming".toLowerCase();

//     for (int i = 0; i <=inputString2.length()-1; i++){
//       char ch = inputString2.charAt(i);
//       if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//         System.out.println(ch + " ");
//       }
//       }

//       String inputString4 = "Java, Python, javaScript, , typeScript";
//       char target = 'P';

// //for loop
// for (int i = 0; i <= inputString4.length(); i++){
//   if (inputString4.charAt(i) == target) {
//     System.out.println("charAt()" + i);
//   }
//}

//indexOf
//System.out.println("indexOf() : " + inputString4.indexOf(target));

//Ex.5 Print Multiplication Table
//Nested Loop

//1 2 3 4 5
// 2 4 6 8 10
//3 6 9 12 15
//4 8 12 16 20
//5 10 15 20 25

// for (int i = 1; i <= 5; i++){
//   for (int j = 1; j <= 5; j++){
//     System.out.println (i*j);}
         
// }

// Ex.7 
//String [] strArr = {"ele1", "ele2"}; //not suggest
//String [] strArr = new String [] {"ele1", "ele2"};
String [] arr1 = new String [4];
String [] arr2 = new String [] {"a", "b", "c", "d"};

for (int i = 0; i < arr1.length; i++){
  arr1[i] = arr2[i]; //put the arr2 element into arr1
  }
  System.out.println("Exercise 7.1: " + Arrays.toString(arr1));

  Ex. 10
  String[] arr5 = new String[] {"abc", "def", "ijk", "xyz"};
  //swap, expect output : "xyz", "ijk", "def", "abc"

  String [] arr6 = new String[arr5.length];
  for (int i = 0; i < arr5.length; i++){
    arr6[i] = arr5[arr5.length -i -1];
  }
  System.out.println(Arrays.toString(arr6));







     



















  }
  
}
