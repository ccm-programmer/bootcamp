import java.util.ArrayList;
import java.util.List;

public class DemoGenerics {
  public static void main(String[] args) {

    // After Java 1.5 -> List
    List<String>strings= new ArrayList<>();

    List <Tiger> tigers = new ArrayList<>();

    //before Java 1.5
    List strings2 = new ArrayList();
    strings2.add("abc");
    strings2.add(13);
    strings2.add(new Tiger());

    Object obj = strings2.get(0);
    String s = (String) obj;
    System.out.println(s.charAt(2));
  }
  
}
