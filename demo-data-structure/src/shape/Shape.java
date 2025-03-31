package shape;

import java.math.BigDecimal;

public abstract class Shape {
  abstract double area();

  public static double totalArea(List<Shape> shapes){
    //Use BigDecimal to sum up all shape.area()
    BigDecimal totalArea = Big decimal.valueOf(0,0)
    for (Shape shape: shapes){
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area())); // immutable
      shape.area();
    }
    return totalArea.doubleValue();




  }
}
