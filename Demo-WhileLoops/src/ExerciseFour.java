// 15-Apr-2025
// nested loop = A loop inside another loop
//               Used often with matrices or Data Structure

import java.util.Scanner;

public class ExerciseFour {
  public static void main(String[] args) {
    
    for (int i = 1; i <=3; i++){
      for (int j = 1; j <=9; j++){
      System.out.print(j + " ");
    }
    System.out.println();
  }
//1 2 3 4 5 6 7 8 9 
//1 2 3 4 5 6 7 8 9 
//1 2 3 4 5 6 7 8 9

    Scanner scanner = new Scanner(System.in);

    int rows;
    int columns;
    char symbol;

    System.out.print("Enter the # of rows: ");
    rows = scanner.nextInt();

    System.out.print("Enter the # of columns: ");
    columns = scanner.nextInt();

    System.out.print("Enter the symbol to use: ");
    symbol = scanner.next().charAt(0);

    for (int i = 0; i < rows; i++){
      for (int j = 0; j < columns; j++){
      System.out.print(symbol);
    }
    System.out.println();
  }

// @@@@@@
// @@@@@@
// @@@@@@

    scanner.close();
  }
  
}
