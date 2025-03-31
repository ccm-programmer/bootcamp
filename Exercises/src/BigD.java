import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigD {
  public static void main (String[] args){
  BigDecimal number = new BigDecimal("10.5467");
  BigDecimal roundNumber = number.setScale(2, RoundingMode.UP);
  System.out.println(roundNumber);  //10.55

  double roundedDoubleNum = roundNumber.doubleValue();
  double result = new BigDecimal("10.5467").setScale(2, RoundingMode.UP).doubleValue();
  System.out.println(result);  //10.55

  // ! You should perform the calculation by valueOf()
  BigDecimal result2 = BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1));
    System.out.println(result2.doubleValue()); // 0.3

  // ! be careful, you should use String as parameter for new BigDecimal()
  BigDecimal result3 = new BigDecimal("0.2").add(new BigDecimal("0.1"));
  System.out.println(result3.doubleValue()); // 0.3

  System.out.println(BigDecimal.valueOf(0.34) //
        .multiply(BigDecimal.valueOf(0.34)) //
        .setScale(3, RoundingMode.UP).doubleValue());
    // 0.1156 -> 0.116

    System.out.println(BigDecimal.valueOf(10) //
        .divide(BigDecimal.valueOf(3), 1, RoundingMode.UP) //
        .doubleValue()); // 3.4

  





  }
  
}
