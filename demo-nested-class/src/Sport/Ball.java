package Sport;
public class Ball {//outer class
  private static final String BRAND = "tesla";
  private Color1 color;

  public Ball(Color1 color){
    this.color = color;
  }

  public static enum Color1{
    RED, YELLOW, BLUE, ORANGE;

    public static String printBrand(){ // belongs to Color 1
      return Ball.BRAND; //able to access outer class static variable
    }
  }

  public static void main(String[] args) {
    Ball b1 = new Ball (Color1.BLUE);
  }
  
}
