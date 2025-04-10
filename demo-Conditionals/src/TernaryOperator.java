// 9-Apr-2025
// ternary operator ? = Return 1 of 2 values if a condition is true
// variable = (condition) ? ifTrue : ifFalse;

public class TernaryOperator {
  public static void main(String[] args) {
    
    int score = 75;

    String PASSorFAIL = (score >= 60) ? "PASS" : "FAIL";

    System.out.println(PASSorFAIL);

    int number = 3;

    String evenOrOdd = (number % 2 == 0)? "Even" : "Odd";

    System.out.println(evenOrOdd);

    int hours = 13;

    String timeOfDay = (hours < 12)? "A.M" : "P.M";

    System.out.println(timeOfDay);
  }
  
}
