import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    // ! During compile time, "strings" object can only call List.class method
    strings.add("abc");
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    //! Same as ArrayList, Ordering is in place for LinkedList
    for (String s: strings){
      System.out.println(s);
    }
    System.out.println(strings.size());  //4
    strings.remove("abc");
    System.out.println(strings); //[abc, def, abc]

    LinkedList<String> strings2 = new LinkedList<>();
    strings2.add("abc");
    strings2.add("def");
    strings2.add("ijk");
    strings2.removeFirst();
    System.out.println(strings2);  //[def, ijk]
    strings2.removeLast();
    System.out.println(strings2); //[def]
  }
  
}
