package shape;

public class Circel extends Shape {
  private double radius;

  public Circle (double radius){
    this.radius = radius;
  }
  
  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius);
    
  }

}
