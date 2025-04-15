// 15-Apr-2025
// for loop = execute some code a certain amount of times

import java.util.Scanner;

public class ExerciseTwo {
  public static void main(String[] args) throws InterruptedException {
    
    for (int i = 0; i < 10; i++){
      System.out.println("pizza");
    }

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter how many times you want to loop: ");
    int max = scanner.nextInt();

    for (int i = 1; i < max; i++){
      System.out.println(i);
    }

    System.out.print("Enter how many seconds to countdown from: ");
    int start = scanner.nextInt();

    for (int i = start; i > 0; i--){
      System.out.println(i);
      Thread.sleep(1000);
      //它的作用是使当前执行的线程暂停（睡眠）1000 毫秒，也就是 1 秒。
      //在这段时间内，该线程不会执行任何操作，从而可以实现一些特定的程序控制逻辑，
      //比如等待一段时间后再进行下一步操作，或者控制程序的执行节奏等。
    }

    System.out.println("Happy New Year!");

    scanner.close();
  }
  
}
