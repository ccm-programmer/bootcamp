import java.util.Random;
import java.util.Scanner;

public class NumberRandomGame{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 生成 1 到 100 之间的随机数
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("欢迎来到猜数字游戏！我已经想好了一个 1 到 100 之间的数字，你可以开始猜啦。");

        //while 循环的工作机制是：只要循环条件为 true，就会不断执行循环体里的代码；
        //一旦循环条件变为 false，循环就会停止。
        while (!hasGuessedCorrectly) {
            System.out.print("Please enter your guess：");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Your guess is smaller than secretNumber, try again");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is larger than secretNumber, try again");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guess it correctly. You tried " + attempts + " times");
            }
        }

        scanner.close();
    }
}    