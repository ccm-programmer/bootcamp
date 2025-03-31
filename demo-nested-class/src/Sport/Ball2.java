package Sport;

public class Ball2 {
  private static final String BRAND = "tesla";
  
  public int getSize;

  // Local inner class
  public void printComma(){    
    Class Comma{
      private static final String value = ",";
    }
    System.out.println(Comma.value);
  }

  public static void main(String[] args) {
    Ball2 b1 = new Ball2(3);
    b1.setColor2(b1.new Color2("BLUE"));

    Ball2.Color2 c2 = b1.new Color2("RED");
  }
}
