// 25-Apr-2025
// Banking program

import java.util.Scanner;

public class DemoBankingProgram{
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
  // JAVA BANKING PROGRAM FOR BEGINNERS
  
  double balance = 0;
  boolean isRunning = true;
  int choice;

  while (isRunning){
  System.out.println("***************");
  System.out.println("BANKING PROGRAM");
  System.out.println("1. Show Balance");
  System.out.println("2. Deposit");
  System.out.println("3. Withdraw");
  System.out.println("4. Exit");
  System.out.println("***************");

  System.out.print("Enter your choice (1-4): ");
  choice = scanner.nextInt();

  switch (choice){
    case 1:
    System.out.println("SHOW BALANCE");
    showBalance(balance);
    break;

    case 2:
    //System.out.println("DEPOSIT");
    balance = balance + deposit();
    break;

    case 3:
    //System.out.println("Withdraw");
    balance = balance - withdraw(balance);
    break;

    case 4:
    isRunning = false;
    break;

    default:
    System.out.println("Invalid choice");
  }
}

  // DECLARE VARIABLES

  // DISPLAY MENU

  // GET AND PROCESS USERS CHOICE

  // showBalance()

  // EXIT MESSAGE
  System.out.println("***************************");
  System.out.println("Thank you! have a nice day!");
  System.out.println("***************************");

  scanner.close();
}

static void showBalance(double balance){
  System.out.println("***************");
  System.out.printf("$%.2f\n", balance);
}
  // deposit()

  static double deposit(){
    double amount;
    System.out.print("Enter an amount to be deposited: ");
    amount = scanner.nextDouble();

    if(amount < 0){
      System.out.println("Amount can't be negative");
      return 0;
    }
    else{
      return amount;
    }
      }

  // withdraw()
  //方法接收一个 double 类型的参数 balance，代表账户的当前余额。
  //在取款时，需要知道账户的余额，从而判断能否进行取款操作。
  //通过传入余额参数，方法就可以在内部进行余额和取款金额的比较。
  static double withdraw(double balance){
    double amount;
    System.out.print("Enter an amount to be withdrawn: ");
    amount = scanner.nextDouble();

    if (amount > balance) {
      System.out.println("Insufficient funds");
      return 0;
    }
    else if (amount < 0){
      System.out.println("Amount can't be negative");
      return 0;
    }
    else{
      return amount;
    }
  }  

}