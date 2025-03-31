package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Instance per method
public class PaymentTest {
  private int x;

  @Test
  void testMethod(){
    this.x++;
    System.out.println(this.x);
    Assertions.assertEquals(3, Calculator.sum(1,2));
  }

  @Test
  void testMethod2(){
    this.x++;
    System.out.println(this.x);
    Assertions.assertEquals(7, Calculator.sum(3,4));
  }

  // Simluate What Maven going.
  public static void main(String[] args) {
    PaymentTest pt = new PaymentTest();
  }

}
