package com.bootcamp.lombok;

// import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
// * = Assertions 裡面所有的 method (including assertEquals)
import org.junit.jupiter.api.Test;

// 1. Junit Test Cases is good for 

public class AppTest {
@Test
void testPerson(){
    Person person = new Person();
    person.setName("Vincent");
    // Expected result, Actual Result
    //Assertions.assertEquals("Oscar", person.getName());
    assertEquals("Oscar", person.getName());
}

@Test
void testCalculator(){
    int actualResult = Calculator.sum(1,2);
    //Assertions.assertEquals(3, actualResult);
    assertEquals(3, actualResult);

    // Assertions.assertEquals(-1, Calculator.sum(6, -7));
    // Assertions.assertEquals(200, Calculator.sum(101, 99));

    assertEquals(-1, Calculator.sum(6, -7));
    assertEquals(200, Calculator.sum(101, 99));

    // hamcrest
    assertThat(Calculator.sum(1,2), is(equalTo(3)));
    assertThat(Calculator.sum(1,2), is(not(equalTo(3))));

    @Test
    void testArray(){
        List<String> myList = Arrays.asList("apple", "banana", "cherry");
        assertThat(myList, hasItem("banana"));
        assertThat(myList, not(hasItem("Orange"));
    }
}
    
}
