import java.util.Comparator;
import Sport.Ball;

public class OrderByColor implements Comparator<Ball> {
  //Red -> White -> Blue
  @Override
  public int compare(Ball b1, Ball b2){
    //b1(-1) vs b2(1)
    if (b1.getColor()= Color.RED)
    return -1; 
    if (b2.getColor()= Color.RED)
    return 1; 
    
  }
  
}
