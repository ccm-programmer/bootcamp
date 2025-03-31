public class Dem0ForEach {
  public static void main(String[] args) {
    int[] arr = new int[]{63, 74, -62, -20};
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    //63 74 -62 -20

    //for-each loop
    //Disadvantage: You can only access the element of that literation
    for (int y : arr) {
      System.out.println(y);
    }
    //63 74 -62 -20

    String[] arr2 = new String[]{"hello", "xxx", "apple"};
    for (String x : arr2){
    System.out.println(x);
    }
    //hello xxx apple

    String[] animals = {"lion", "tiger", "bear"};
    for (String x : animals){
      System.out.println(x);
    }
    //lion tiger bear

    //abaababbbyabrs
    //Find out which character appear the most number of times
    //Given that all characters are lower case character
    
    
//do-while-loop
//!at least do once
int x = 10;
do{
  System.out.println(x);
  x++;
}while (x < 14);
//10 11 12 13



  }
}
