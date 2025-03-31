public class DemoDouble {
  public static void main(String[] args) {
    // float, double
    //10.3 --> double value
    //double d1 = 10.3;
    //float f1 = 10.3; //wrong, cannot put double to float

    // byte -> short -> int -> long -> float -> double
    // no precision loss 無精度損失

    // 6 --> int value
    //!!! special case we can put int value into lower class type byte & short
    //byte b10 = 6;
    //short s10 = 6;

    //int i11 = 6;
    //b10 = i11;

    // 6 --> int value
    // 6L --> long value
    //long l12 = 6L;   //6L=6.0
    float f12 = 6L;
    System.out.println(f12);
    double d12 = 6L;
    System.out.println(d12);


    
  }
  
}
