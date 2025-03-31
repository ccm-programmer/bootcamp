import java.util.Arrays;

public class DemoString {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "apple";
    System.out.println(s1.compareTo(s2));
    //7 -> 'h' to 'a'

    String s3 = "abbbb";
    System.out.println(s3.compareTo(s2));
     //-14 -> 'b' to 'p'

     String s4 = "hello";
     System.out.println(s1.compareTo(s4));
     //0, they are equals
     String s5 = "hello!";
     System.out.println(s1.compareTo(s5));
     //-1

     String s6 = "";
     if (!s6.isEmpty()){
      System.out.println("s6 is not empty");
      }     

     String s7 = " ";
     System.out.println(s7.isBlank()); //true
     System.out.println(s7.isEmpty()); //false

     System.out.println(s6.isBlank()); //true
     System.out.println(s6.isEmpty()); //true

     String s9 = "hello world !!!!";
     //String method will create new String
     String s10 = s9.replace('o', 'x');
     System.out.println(s10);
     //hellx wxrld!!!!

     //Given a String (s9), convert to a target String,
     //which it is from even index & it is a character, make it become BLOCK letter.
     //ie. "hello world !!!!" -> "HeLlo WoRlD !!!!"
     

     //char vs String
     char[] chs = s9.toCharArray();
     System.out.println(Arrays.toString(chs));
      //[h,e,l,l,o, ,w,o,r,l,d, ,!,!,!,!]
      
     //Searching Algorithm
     //-->String + for loop + charAt

     //Revise the String Algorithm
     //String --> toCharArray() --> char[] --> edit the value in char[] --> String

     String apple = "apple";
     char[] ch2 = apple.toCharArray();
     for (int i = 0; i < apple.length(); i++){
           System.out.println((int) ch2[i]);    }
           //97
           //112
           //112
           //108
           //101

           ch2[2] = 'x';
    // from char[] to String
    String target = new String(ch2);
    System.out.println(target); // apxle

      //Both s20-22 storing "hello"
      String s20 = "hello";
      String s21 = new String("hello");
      String s22 = String.valueOf("hello");




  }
  
}
