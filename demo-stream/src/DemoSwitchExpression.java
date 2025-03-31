public class DemoSwitchExpression {
  public static void main(String[] args) {
    Color color = Color.YELLOW;
    // Tranditional switch
    int x = 0;
    switch (color) {
      case RED:
      x = 3;
      break;
      case BLUE:
      x = 4;
      break;
      case YELLOW:
      x = 5;
      break;
      default:
      break;
    }
    // Java 14
    // Switch Expression
    // 1. Compile time ensures you have no missing enum value in switch expression

    int x2 = switch (color) {
      case RED -> 3;
      case BLUE -> 4;
      case YELLOW -> 5;
    };

    char c = 'a';
    int ascii = switch (c) {
      case 'a':
      System.out.println("case a");
      yield 97;}

      default -? 
      System.out.println("default");
      yield
    

  }

  public static enum Color {
    RED, YELLOW,BLUE,;
  }
}
