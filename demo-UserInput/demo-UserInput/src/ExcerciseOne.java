//Excercise on 31-Mar-2025
//Calculate an area of rectangle

import java.util.Scanner;

public class ExcerciseOne {
  public static void main(String[] args) {
    
    double width = 0;
    double height = 0;
    double area = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("please input width: ");
    width = scanner.nextDouble();

    System.out.println("please input height: ");
    height = scanner.nextDouble();

    area = width * height;

    System.out.println("The area is: " + area + "cm²");
    
    scanner.close();
  }
}
