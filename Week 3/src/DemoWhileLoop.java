public class DemoWhileLoop {
  public static void main(String[] args) {
    //While
    //Step 1: check if < 4
    //Step 2: print i
    //Step 3: i++ --> 1
    //Step 4:check if < 4
    //Step 5:print i
    //Step 6:i++ --> 2
    //Step 7:check if < 4
    //Step 8:print i
    //Step 9:i++ --> 3
    //Step 10:check if < 4
    //Step 11:print i
    //Step 12:i++ --> 4
    //Step 13:check if < 4 -->false
    //Step 14:exit while loop


    int i = 0;
    while (i < 4){
      System.out.println("i = " + i);
      i++;
      System.out.println("hello");
    }
    System.out.println("Finally = " + i);
    // i = 0
    // hello
    // i = 1
    // hello
    // i = 2
    // hello
    // i = 3
    // hello
    // Finally = 4


//counting
String s = "abcdabcdabcd";
//while loop, how many b inside the String?

int y = 0;
int count = 0;
while (y<s.length()){
  if (s.charAt(y) == 'b'){
  count++;}
  y++;
  }
  System.out.println(count);
  //3




















  }
}
