import java.util.Scanner;

public class DemoScanner1 {
  public static void main (String[] args){

    Scanner input = new Scanner (System.in);
    System.out.println("Please input a number");
    int number = input.nextInt();
    System.out.println("The number is: " + number);

    if (number % 2 ==0){
      System.out.println("This is an even number");
      }
      else{
        System.out.println("This is odd number.");
      }
  }
  
}
