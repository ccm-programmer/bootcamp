import java.util.Scanner;

public class SupermarketShoppingII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double singlePrice = 23;
        double discountPrice = 36;

        System.out.print("What do you want to buy?：");
        String productStyle = scanner.nextLine();

        System.out.print("Please input the order quantity of " + productStyle + " you want to buy：");
        int quantity = scanner.nextInt();

        double totalPrice;
        if (quantity % 2 == 0 && quantity >= 2) {
            totalPrice = (quantity / 2) * discountPrice;
        } else {
            totalPrice = (quantity / 2) * discountPrice + singlePrice;
        }

        System.out.println("You bought " + quantity + " pc(s) " + productStyle + " Total amount $" + totalPrice);
        scanner.close();
    }
}    