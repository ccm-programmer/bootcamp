// Exercise 1 on 2-Apr-2025
// Random

import java.util.Random;

public class DemoRandom {
  public static void main(String[] args) {
    Random random = new Random();

    int number;
    number = random.nextInt(1, 7); //random number between 1-6, 7 is exclusive
    System.out.println(number);

    double number1;
    number1 = random.nextDouble();
    System.out.println(number1);

      boolean isHeads;
      isHeads = random.nextBoolean();
      
      if (isHeads){
        System.out.println("Heads");
      } else{
        System.out.println("Tails");
      }
  }
}
