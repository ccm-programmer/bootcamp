package DemoStaticMethod;

import javax.swing.event.SwingPropertyChangeSupport;

public class Calculator {

  //static method
  public static int add1(int x, int y){
    return x + y;
  }  
  
  public int add2(int x, int y){
    return x + y;}
  
 

  public static void main(String[] args){
    System.out.println(Calculator.add1(2,3)); //5

    Calculator cal = new Calculator();
    System.out.println(cal.add2(10, 10));  //20
    System.out.println(cal.add2(20, 30)); //30
  }




}
