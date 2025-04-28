// 18-Apr-2025

public class DemoVariableScope {

  static int x =3;  
  // Class scope, main method and doSomething method also can see & call it.
  
  public static void main(String[] args) {
    int x = 1; //LOCAL scope inside main method
    System.out.println(x);

    doSomething();
  }

  static void doSomething(){
    int x = 2;  //Local scope inside doSomething method
    System.out.println(x);
  }
  
}
