public class DemoChar {
  public static void main(String[] args) {
    //data type: char
    String s = "hello";
    String s2 = "h";
    System.out.println(s + s2);

    //data type: char, which sstores single character only.

    char c = 'h';
    System.out.println(c);

    c = 'a'; //re-assignment
    c= '你'; 
    //c = 'c = 'こんにちは'; //只可以打一個字
    System.out.println(c);

    // int vs char
    // ! char -> int -> long -> float -> double
    char x = 'p';
    System.out.println(x + 1); //char + int = int
    //p=112 from 
    
    char x2 = '0';
    System.out.println(x2 + 0); //48

    char x3 = 'a';
    System.out.println(x3 + 0); //97

    char x4 = 'A';
    System.out.println(x4 + 0); //65

    int i10 = x4 + 5;
    System.out.println(i10);  //70

    long l8 = x3 + 9;
    System.out.println(l8);    //106

    char h = '你';
    System.out.println(h + 0); //20320, 你代表的數字是20320

    int y = 40000;
    char h2 = (char) y;  //迫java將int>char, 就用(char)
    System.out.println(h2);//鱀代表的數字是40000

  }
  
}
