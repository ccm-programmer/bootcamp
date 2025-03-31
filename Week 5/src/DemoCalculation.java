public class DemoCalculation {
  public static void main(String[] args) {
    Integer num1 = Integer.valueOf(127); //create an object of 127
    Integer num2 = Integer.valueOf(127); //within -128 to 127, reuse the same object of 127
    Integer num5 = Integer.valueOf(127); //within -128 to 127, reuse the same object of 127
    //Java 對 Integer 對象在 -128 到 127 之間進行了緩存。如果使用 Integer.valueOf 方法並且值在此範圍內，則會重用已有的對象。
    //超出此範圍（如 128），會創建新的對象。

    System.out.println(num1 == num2);  //true, they are same object
     // ! In Java, for object, "==" is to check if they are same object

    System.out.println(num1.compareTo(num2)); //0
    //compareTo 比較的是數值，返回 0 表示兩個數字相等。

    Integer num3 = Integer.valueOf(128);  // create an object of 128
    Integer num4 = Integer.valueOf(128);  // create an object of 128
    //For Number (Byte, Short, Integer, Long), -128 to 127, over 128 will create a new object
    System.out.println(num3 == num4); //false, they are different object
    System.out.println(num3.compareTo(num4)); //0

    Integer num6 = new Integer(127);
    System.out.println(num1 == num6); // false
    //new Integer(127) 強制創建一個新對象，因此 num1 == num6 為 false，即使它們的值相同。

    Integer num7 = 127;
    System.out.println(num1 == num7); // true
    //num7 使用自動封箱，會使用緩存中的 127 對象，因此 num1 == num7 為 true。
    
    num7 = num6; // 127
    num6 = 190;

    System.out.println(num7 + 20); // 147




  }
}
