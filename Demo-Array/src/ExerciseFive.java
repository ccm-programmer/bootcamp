// 13-May-2025
// search an array

import java.util.Scanner;

public class ExerciseFive {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 9, 2, 8, 3, 5, 4};
    int target = 2;
    boolean isFound = false;

    for (i = 0; i < numbers.length; i++){
      if(target == numbers[i]){
        System.out.println("Element found at index: " + i);
        isFound = true;
        break;
        // Element found at index: 2
      }
    }
    if(!isFound){
      System.out.println("Element not found in the array");
      }

   
    String[] fruits ={"apple", "orange", "banana"};
    boolean isFound2 = false;
    String target2;

    System.out.print("Enter a fruit to search for: ");
    target2 = scanner.nextLine();
    //String target2 = "orange";
    

    for (i = 0; i < fruits.length; i++){
      if(fruits[i].equals(target2)){
        System.out.println("Element found at index: " + i);
        isFound2 = true;
        break;
        // Element found at index: 2
      }
    }
    if(!isFound2){
      System.out.println("Element not found in the array");
      }
      scanner.close();
  }
}
