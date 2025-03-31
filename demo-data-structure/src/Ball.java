import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball{
    private Color color;
    private double size;

    public Ball (Color color){
      this.color = color;
    }

    @Override
    public int compareTo(Ball ball){
      // -1 or 1
      // this (-1) vs ball (1)
      if (this.color == ball.getColor())
      return 1;

      if (this.color ==Color.BLUE)
      return -1;

      if(ball.getColor() = Color.BLUE)
      return 1;

      if(this.color == Color.RED && ball.getColor() == Color.WHITE)
      return -1;

      if(ball.getColor() == Color.RED && this.color == Color.WHITE)
      return -1;

      return -1;
    }

    @Override
    public String toString(){
      return "Ball[" //
      + "color = " + this.color.name() //
      +"]";
    }

    public static void main(String[] args) {
      List<Ball> balls = new ArrayList<>();
      balls.add(new Ball (Color.WHITE, 10.3));
      balls.add(new Ball (Color.RED, 7.9));
      balls.add(new Ball (Color.BLUE, 9.9));
      balls.add(new Ball (Color.RED, 10.0));
      
      
      // Comparable
      Collections.sort(balls);
      System.out.println(balls);
      //[Ball]
      //Comparator

    }


    
  }
  

