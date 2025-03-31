//! All class in java implicity extends Object.class
public class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  // It is to define a person
  // Person p1 = new Person(Vincent, 19);
  //Person p2 = new Person(Sally, 19);
  //p1.equals(p2) -> p1 (=this) & p2 (=obj)
  @Override
  public boolean equals(Object obj){
    // Early return
    if (this == obj){
      return true;
    }
    if(!(obj instanceof Person)){
      return false;
    }
    Person person = (Person) obj;
    // person definition
    //return person.getAge() == this.age
    //&& person.getName().equals(this.name);
    return Objects.equals(person.getAge(), this.age)
    && Objects.equals(person.getName(), this.name);

    //Person person2 = new Dog();
        Object dog = new Dog();
        dog = new Person("Vincent, 19");
    //! Because dog object is in Object reference. So, it cannot ensure the instance methods during compile time.
    //instance methods during compile time
    //dog.barking();
    if (dog instance of Dog){
      Dog dog2 = (Dog) dog;
      dog2.barking();
    } else if (dog instance of Person){
      Person person = (Person) dog;
      System.out.println(person.getName());
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.toString());

    System.out.println(p1.toString());

    Object o1 = new Object();
    System.out.println(o1.toString());
    // Object.toString
  }
  
}

Machine x = new Projector(3.4);
if (x instanceof Projector){
  Projector x2 = (Projector) x;
  x2.def();
  System.out.println(x2.getColor());
}
