import javax.swing.event.SwingPropertyChangeSupport;

public class Week {
  private static int counter = 0;
  private int number;
  // Constant naming conversion -> Block Letters + Underscore
  public static final int WEEK_OF_DAYS = test();
  public static final int DAY_OF_HOURS = test2();
  public static final int WEEK_OF_HOURS;

  public Week(){
    System.out.println("Create Week Object...");
    this.number = ++counter;
  }

  // Initializer Block
  // ! Everytime you create a new Week object, Initializer Block go first before constructor.
  {
    System.out.println("Initializer Block...");
    // ! Able to control object, so we can use "this" here...
    this.number = ++counter;
  }

  // !Static block go first? or static method?
  static{
    System.out.println("Static Block...");
    // NO_OF_DAYS = 7;
    WEEK_OF_HOURS = WEEK_OF_DAYS * DAY_OF_HOURS;
    }

    public static int test(){
      System.out.println("Static Method test()...");
      return 7;
    }

    public static int test2(){
      System.out.println("Static Method test2()...");
      return 24;
    }

    public int getNumber()

  
  public static void main (String[] args){
    // Static Method test()...
    // Static Method test2()...
    // Static Block...
    System.out.println(Week.WEEK_OF_HOURS);  //168

    Week w1 = new Week();
    Week w2 = new Week();

    // Initializer Block...
    // Creating Week object
}
}
