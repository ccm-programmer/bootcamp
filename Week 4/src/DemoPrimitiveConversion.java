public class DemoPrimitiveConversion {
  public static void main (String[] args){  

  int i1 = 3;
  double d1 = 9.3;
  System.out.println(i1 + d1);

  float f2 = 3.4f;   //3.4f is a float value
  double d2 = 3.4f; //float is a lower value, so can assign to a higher level (double) value

  //byte -> short -> int -> long -> float -> double
  //char -> int -> long -> float -> double

  int i2 = 10;
  long l1 = 10L;
  long l2 = 10;

  float f3 = 20L;  //OK ->20.0

  double d3 = 3.4d; //double value

  double d4 = 3.4;
  //float f1 = d4; //why? Java: not safe -> incorrect syntax
  //because d4 may contain a value with high precisions

    //!As a Java developer, you have a right to make it happen (take the risk)
    //take risk = Explicit conversion
    float f1 = (float)d4;
    System.out.println("f1= " + f1);

    int i3 = 32768;
    short s1 = (short)i3;  //shor max=32767
    System.out.println("s1= " + s1); //s1= -32768, overflow

    int i4 = -32769;
    short s2 = (short)i4;  //shor max=32767
    System.out.println("s2= " + s2); //s2= 32767, overflow, bacl to the original starting point

    double d5 = 6.7;
    int i5 = (int) d5; //downcasting, take risk)
    System.out.println("i5= " + i5); //i5=6, precision loss

    char c1= 'a';
    int i6 = (int)c1;
    System.out.println("c1= " + i6); //97

    //Implicit Conversion (from int to lower level)
    //real-time check if the value 97 is with the range scope of type
    char c3 = 97;
    byte b1 = 97;
    short s3 = 97;
    //char c4 = i6; //NOT OK if we use data type instead of number

    //Implicit Conversion (NOT OK -> from float to lower level)
    //int i = 1.9f;
    //short s4 = 1.9f;

    short s5 = 32767;
    short s6 = 1;
    //short + short -> int + int --> int
    int result = (int) s5 + (int) s6;
    System.out.println("s5 + s6= " + result);

     //byte + byte -> int + int --> int
    byte b10 = 127;
    byte b11 = 1;
    byte b12 = (byte) (b10 + b11); //keep byte instead of int
    System.out.println(b12);  //overflow, -128















}

}


