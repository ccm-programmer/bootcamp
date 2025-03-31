import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    //0.2+0.1
    System.out.println(0.2+0.1);
    //0.30000000000000004  --> why?

    // Java Solution: Built-in Java class
    BigDecimal bd = new BigDecimal(10L);
    System.out.println(bd.doubleValue());
    long result = bd.longValue();

    //object cannot use +,-,*, /

    int x = bd2.intValue();
    System.out.println(x);

    //! You should calculate the value by using ValueOf()
  }
  
}
