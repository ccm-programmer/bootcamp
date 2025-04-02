// Daily life on 2-Apr-2025
// Supermarket shopping
// Drink $18/pack, $36/2 packs

import java.util.Scanner;
public class SupermarketShopping {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double SinglePrice = 23;
    double DiscountPrice = 36;

    System.out.print("Please enter your order quantity：");
    int quantity = scanner.nextInt();

    double TotalAmount;
    
    if (quantity % 2 == 0) {
      TotalAmount = (quantity/2) * DiscountPrice;
    } else {
      TotalAmount = (quantity-1)/2 * DiscountPrice + SinglePrice;
    }
    System.out.println("You bought " + quantity + " pcs and total order amount is $" + TotalAmount);
    scanner.close();
  }
}
