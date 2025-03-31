public enum Color {
  RED('R'), //
  YELLOW('Y'), // 
  BLACK('B'), //
  ;

  // ! Usually 99% we use final for enum 
  private final char value;

  //enum has constructor
  // ! For enum, you can use "private" for constructor
  private Color (char value){
    this.value = value;
  }

  public char getValue(){
    return this.value;
  }

   
  // ! Everytime you press the "Run" button,
  // 1. Load the classes to the memory 
  // - (For enum, JVM will help create an unique object(s) before excuting the main method)
  // - In memory, there are only 3 color objects. RED, YELLOW, BLACK

  public static void main(String[] args) {
    String red1 = "RED";
    String red2 = "red";
    String red3 = "Red";
    String red4 = new String ("RED");
    System.out.println(red1.equals(red4)); // true, because Override Object.equals()
    // String.class extends Object.class
    // ! What if String.class did not Override equals()? -> Object.equals

    // Never to create enum object by yourseslf
    // new Color()
    Color red10 = Color.RED;
    Color red11 = Color.RED;
    System.out.println(red10 == red11); //True

    if (red11 == Color.BLACK) { //! We always use "-"==" to compare enum value
    System.out.println(red11 = BLACK);

    System.out.println(red11.getValue());
    System.out.println(Color.YELLOW.getValue());



    }

  }
  
}
