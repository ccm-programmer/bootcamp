import javax.swing.event.SwingPropertyChangeSupport;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(s); //abc
    String s2 = s.concat("def");  //return a new String object
    System.out.println(s2); //abcdef

    StringBuilder sb = new StringBuilder("abc");
    System.out.println(sb);  //abc
    sb.append("def");
    System.out.println(sb); // abcdef

    // ! Why StringBuilder ?
    System.out.println(sb.replace(1, 3, "x")); // axdef
    System.out.println(sb); // axdef

    int amount = 1_000_000;
    // StringBuilder has the best performance on String operation
    StringBuilder sb3 = new StringBuilder();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++){
      sb3.append("a");
    }

    long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime); //4ms
    System.out.println(sb3.length()); //100000

    String s10 = "";
    startTime = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      s10 += "a";
    }
    endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime); // 305 ms
    System.out.println(s10.length()); // 100_000


    StringBuilder sb1 = new StringBuilder("Hello, World!");
    for (int i = 0; i < sb1.length(); i++){
      char c = sb1.charAt(i);
      if (!Character.isLetter(c) && !Character.isWhitespace(c)){
        sb1.deleteCharAt(i);
        i--;
      }
    }
    String result = sb1.toString();
    System.out.println(result); //Hello World

    
    
  }
  
}
