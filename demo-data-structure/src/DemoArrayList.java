import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    // Array
    // !disadvantages
    /*
     * 1. Define length of array (The length is static)
     * 2. For modification, you have to locate the position of array
     */
  String[] arr = new String[]{"hello", "abc", "def", "abc"};
  System.out.println(arr[2]);  //def
  arr[1] = "bye";
  for (int i = 0; i < arr.length; i++){
    if (arr[i].equals("abc"))
    arr[i] = "ijk";
  }

  // ArrayList
  // ! Dynamic Length
  ArrayList<String> strings = new ArrayList<String>();
  // "new ArrayList<String>()" -> create a  ArrayList of String object
  // "ArrayList<String> strings" -> ArrayList of String object reference

  // After Java 1.5 (200x)
  ArrayList<String> string2 = new ArrayList<>();
  // ! Array

  List<String> strings3 = new ArrayList<>();
  strings3.add("hello");
  strings3.add("abc");
  
    }
  
}
