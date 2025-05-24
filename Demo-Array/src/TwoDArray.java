//23/May/2025
//2D Array = An array where each element is an array
// Useful for storing a matrix of data

//23/May/2025
//2D Array = An array where each element is an array
// Useful for storing a matrix of data

public class TwoDArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef"};

        String[][] groceries = {fruits, vegetables, meats};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}