package com.bootcamp.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class Payment2Test {
  private boolean success;

  @Test
  void testAction1(){
    assertEquals(3, Calculator.sum(1,2));
    this.success = true;
  }

  @Test
  void testAction2(){
    System.out.println("Start testAction2");
    if (this.success){
      System.out.println("Test Action2");
    }

  }
}
