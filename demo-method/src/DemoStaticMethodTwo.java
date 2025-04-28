// 18-Apr-2025
// Square a number and return the result
// Cube a number and return the result

public class DemoStaticMethodTwo {
  public static void main(String[] args) {
    double result = square(3);
    System.out.println(result);

    double result1 = cube(5);
    System.out.println(result1);

    String fullName = getFullName("Ivy", "Chow");
    System.out.println(fullName);

    int age = 21;
    if(ageCheck(age)){
      System.out.println("You may sign up!");
    }
    else{
      System.out.println("You must be 18+ to sign up");
    }
  }

  // We use "static" here because we're calling a method from another method which is static
  static double square (double number){
    return number * number;
  }

  static double cube(double number){
    return number * number * number;
  }

  static String getFullName(String first, String last){
    return first + " " + last;
  }

  static boolean ageCheck (int age){
    if (age >=18){
      return true;
    }
    else{
      return false;
    }
  }
}
