//Exercise on 31-Mar-2025
//Calculate an area of rectangle

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        // 获取宽度输入并确保为正数
        while (true) {
            try {
                System.out.println("please input width: ");
                width = scanner.nextDouble();
                if (width > 0) {
                    break;
                } else {
                    System.out.println("宽度必须是正数，请重新输入。");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入无效，请输入有效的数字。");
                scanner.nextLine(); // 清除无效输入
            }
        }

        // 获取高度输入并确保为正数
        while (true) {
            try {
                System.out.println("please input height: ");
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                } else {
                    System.out.println("高度必须是正数，请重新输入。");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入无效，请输入有效的数字。");
                scanner.nextLine(); // 清除无效输入
            }
        }

        area = width * height;
        System.out.println("The area is: " + area + "cm²"); //Alt+253

        scanner.close();
    }
}    