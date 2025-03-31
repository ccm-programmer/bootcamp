package com.bootcamp.lombok;

// JDK (1. Auto import (java.lang); 2. manual-import (java.time))
// non-JDK (3. External lib by Maven -> manual import)
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Person {
  @Getter
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1 = new Person("Jimmy", 13);
    Person p2 = new Person("Jimmy", 13);

    System.out.println(p1.equals(p2));

    Person p3 = Person.builder() //
    .name("Vincent") //
    .age(18) //
    .build();
  }
  
}
