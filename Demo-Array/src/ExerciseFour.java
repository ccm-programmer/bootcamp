//12-May-2025

import java.util.Scanner;

public class ExerciseFour {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] foods;
    int size;

    System.out.println("What # of food do you want?: ");
    size = scanner.nextInt();
    scanner.nextLine(); //*Remark */

    foods = new String[size];

    for (int i = 0; i < foods.length; i++){
      System.out.println("Enter a food: ");
      foods[i] = scanner.nextLine();
    }

    for (String food : foods){
      System.out.println(food);
    }

    scanner.close();
  }
  
}

//*Remark 
在 Java 中, scanner.nextLine(); 放在 size = scanner.nextInt(); 
之后是为了消耗掉nextInt()后残留的换行符，避免影响后续输入。具体原因如下：
问题根源: nextInt()与nextLine()的行为差异
nextInt() 只读取数值，不会消耗换行符。
当用户输入数字并按下回车键时，输入缓冲区中会留下一个换行符 \n。
nextLine() 会读取整行内容（包括换行符），直到遇到换行符为止。
如果缓冲区中已有残留的换行符,
nextLine() 会直接读取这个换行符并返回空字符串，导致跳过用户的输入。

在使用 nextInt()、nextDouble() 等方法后，如果需要立即使用 nextLine()，
必须先调用 scanner.nextLine(); 消耗残留的换行符，确保输入逻辑正常。
这是 Java 输入处理中的常见陷阱，理解缓冲区机制可以避免此类问题。
*//
