public class DemoStaticMethod {
  public static void main(String[] args)  {
    int result = sum (3,2);
    System.out.println(result);  //5
    System.out.println(sum(4,9)); //13
    System.out.println(sum(4, 9, 10)); // 23
    System.out.println(concat("abc", "def")); // abcdef
    System.out.println(RectangleArea(4,7)); //4*7=28
    System.out.println(CircleArea(2.0));
    System.out.println(FindMax(new int[]{3,5,7,9,11})); //11  
  }

  public static int sum(int a, int b){
  return a + b;
}

public static int sum(int a, int b, int c){
  return a + b + c;
}

public static String concat(String a, String b){
  return a.concat(b); // create a new String
}

public static int RectangleArea(int a, int b){
    return a * b;
  }

  public static double CircleArea(double radius){
    return Math.pow(radius, 2.0) * Math.PI;
    //使用更精確的圓周率：可以使用 Math.PI 替代 3.14，以提高計算的精度。
    //Math.pow(radius, 2.0)：此方法是通用的乘冪計算，適合任何次方計算。
  }

  public static int FindMax(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  public static char lastChar(String s) { // ! what if s length = 0
    return s.charAt(s.length() - 1);
  }

  public static String substring(String s, int fromIndex, int toIndex) {
    String s1 = "";
    for (int i = fromIndex; i <= toIndex; i++) {
      s1 += s.charAt(i); // String + char -> String
    }
    return s1;
  }

  public static String replace(String original, char from, char to) {
    return null;
  }
}