// 6-May-2025

import java.util.Arrays;

public class ExerciseOne {
  public static void main(String[] args) {
    String[] fruits = {"apple", "orange", "banana", "coconut"};
    System.out.println(fruits[0]); //apple

    fruits[0] = "pineapple";
    System.out.println(fruits[0]); //pineapple

    int numOfFruits = fruits.length;
    System.out.println(numOfFruits); //4
    Arrays.sort(fruits);
    //banana
    //coconut 
    //orange
    //pineapple   

    Arrays.fill(fruits, "pineapple");
    //pineapple 
    //pineapple  
    //pineapple 
    //pineapple  

    for (int i = 0; i < fruits.length; i++){
      System.out.println(fruits[i]);
      //pineapple
      //orange
      //banana
      //coconut
    }

    for (String fruit : fruits){
      System.out.println(fruit);
      //pineapple
      //orange
      //banana
      //coconut
    }
  }
}
