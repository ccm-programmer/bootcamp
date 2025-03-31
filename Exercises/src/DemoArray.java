import java.util.Scanner;
public class DemoArray {
  public static void main (String[] args){
    System.out.println("Please input the number of the students");
    Scanner s = new Scanner (System.in);
    int number = s.nextInt();
    int[] grades = new int[number];
    System.out.println("Please input the grades of the students");
    for (int i = 0; i < grades.length; i++){
      grades[i]=s.nextInt();
    }

    int total = 0;
    for (int i = 0; i < grades.length; i++){
      total += grades[i];
    }
    int average = total / grades.length;
    System.out.println("average= " + average);
  }
}
