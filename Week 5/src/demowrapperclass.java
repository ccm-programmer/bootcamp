public class demowrapperclass {
  public static void main(String[] args) {
    int x = 3;
    int x2 = 6;
    if (x > x2){}
    //primitive, can use >, <, >=, <=....to compare

    Integer y = 4;
    String s = "hello";
    
    y=new Integer(4);
    Integer y2 = 8;
    if (y.compareTo(y2)<0){
      System.out.println("y is smaller than y2");
    }
    else{
      System.out.println("y2 is smaller than y");
    }
    //y is smaller than y2

    if (y.compareTo(new Integer(4)) == 0){
      System.out.println("y is equals to 4");
    }
    //y is equals to 4

    int x3 = y;  //un-boxing
    Long l2 = 10L; //auto box
    System.out.println(x3); //4
    System.out.println(l2); //10

    double d1 = y.doubleValue(); //Integer --> int --> double
    //Long l1 = new Integer(10);  //Integer --> int --> long --> long
    Long l1 = new Integer(10).longValue(); //Integer --> long --> long
    System.out.println(d1); //4.0
    System.out.println(l1);  //10
    
    Double d4 = new Double(8.4);
    System.out.println(d4); //8.4

    //Other types
    boolean b1 = new Boolean(false);  //unboxing
    Character c1 = 'a';   //auto-box, char to Character
    c1 = new Character('a');
    System.out.println(b1);  //false
    System.out.println(c1);  //a

    Float f1 = 9.9f;   //auto-box
    float f2 = new Float(9.9); //un-box
    System.out.println(f1); //9.9
    System.out.println(f2);  //9.9

    Byte b5 = (byte) 8;
    byte b6 = new Byte((byte)8);
    System.out.println(b5);  //8
    System.out.println(b6);  //8

    Double d6 = 8.5d;
    System.out.println(d6);  //8.5

    Integer i5 = Integer.valueOf(8);
    System.out.println(i5);  //8

    String s2 = String.valueOf("hello");
    System.out.println(s2); //hello

    String s3 = String.valueOf(9);
    System.out.println(s3); //9
    




  }
}
