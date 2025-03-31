public class DemoTypeInference {
  public static void main(String[] args) {
    // Strong type (compile time)
    int x = 3;

    // Java 10
    var y = 3;  // var is determined during compile time, by the first initialization
    // confirm y is in int type.
    // y = 10.3; // compile error

    var person = new Person();
    
  }

  public static class Person{

  }

  // var cannot be used as parameter
  // public static int sum (var x, var y){
    //return x + y;}

    // var cannot be used as return type
  
  
}
