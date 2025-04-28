// 18-Apr-2025
// overloaded methods = methods that share the same name, but different parameters
// signature = name + parameters

public class DemoOverloaded {
  public static void main(String[] args) {
    System.out.println((add(1, 2)));

    System.out.println((add(1, 2, 3)));

    String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
    System.out.println(pizza);
  }

  static double add(double a, double b){
    return a + b;}

  static double add(double a, double b, double c){
      return a + b + c;}

  //method name "add" is same and it is allowed.
  // It is not allowed to use same parameter "double a, double b"

  static String bakePizza (String bread){
    return bread + " pizza";
  }

  static String bakePizza (String bread, String cheese){
    return cheese + " " + bread + " pizza";
  }

  static String bakePizza (String bread, String cheese, String topping){
    return topping + " " + cheese + " " + bread + " pizza";
  }
  
}
