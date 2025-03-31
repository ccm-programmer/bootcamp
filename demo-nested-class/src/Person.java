public class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public static class Builder{
    private String name;
    private int age;
  }

  public Builder name(String name){
    this.name = name;
    return this;
  }

  public Builder age(int age){
    this.age = age;
    return this;
  }

  public Person build(){
    return new Person (this.name, this.age);
  }
    
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(18);
    p1.setName("Oscar");
    System.out.println(p1.getAge());
    System.out.println(p1.getName());

    // Builder Pattern
    // 1. You don't need specify tbe all-arg constructor for 100 attributes
    // 2. it is easy to verify the object values when you are creating the object
    Person p2 = Person.builder()
    .name("Oscar") //
    .age(18)  //
    .build();
  }
}
