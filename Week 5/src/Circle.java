import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;

  public double getRadius(){
    return this.radius;
  }
  
  public void setRadius(double radius){
    this.radius = radius;
  }

  //public double area
  public double area(){
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .setScale(2, RoundingMode.UP)
    .doubleValue();
     }

}
