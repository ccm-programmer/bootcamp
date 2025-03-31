import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {  // ! class cannot use private, must be public
  private double radius;  //non-static & non final -> instance variable
  //private double radius = 3.0; 
  private String label;

  // ! static variable belongs to class
  // ! final variable once being assigned, the value cannot be changed
  // Constant (static final) -> Block Letters
  public static final double PI = Math.PI; //3.141592653589793

  // ! belongs to class, but can be modified
  private static String color = "RED";

  private static int count = 0;

  private final int number = 10;  //Every circle object has an attribute "number" 10, never being changed.

  // empty constructor -> no parameters
  public Circle(){
    this.radius = 10.0;
    this.label = color + "_" + ++count; //RED1, RED2, RED3
  }

  public Circle(double radius){
    this.radius = radius;
    this.label = color + "_" + ++count;  //RED1, RED2, RED3
  }

  public static void setColor(String newColor){
    color = newColor;
  }

  



 public static void main(String[] args){
  Circle c1 = new Circle();
  c1.setRadius(3.5);
    System.out.println(c1.getRadius());
    System.out.println(c1.area());
    System.out.println(c1.getlabel());

    Circle c2 = new Circle();
    System.out.println(c2.getlabel());  //RED2

    // Compile-time error
    // Circle.PI = 3.19; //final field Circle.PI cannot be assigned

    int x = 1;  //Local Variable
    // ! Local variable 



  
  
  }
   }
  
  