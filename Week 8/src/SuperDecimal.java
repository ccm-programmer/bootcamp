import java.math.BigDecimal;

// ! BigDecimal didn't "final", so we can extends
// ! Once you final the class, no other class can extends this class anymore.
public final class SuperDecimal extends BigDecimal {

  public SuperDecimal(double value){
    super(value);
  }

  public long longValue(){
    return 10L;
  }

  public int intValue(){
    return (int) Math.ceil(super.doubleValue());
  }
  //! super.doublevalue() -> In the current object, "super" as a keyword to find parent
  //! super.doublevalue() -> 3.3 -> ceil() -> 4.0 -> (int) 4

  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal(3.3);
    System.out.println(bd1.longValue()); //3
    System.out.println(bd1.intValue());

    BigDecimal sd1 = new SuperDecimal(3.3);
    System.out.println(sd1.longValue()); //10 
  }
  
}
