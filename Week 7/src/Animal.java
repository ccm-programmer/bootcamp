public class Animal {
  private int age;
  private String color;

  // implicitly empty  constructor
  public Dog(){
    super();  //call the parent constructor
  }

  public Animal(){}

  public Animal (int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public static void main(String[] args) {
    // !1. Constructor can be used for object creation
    Animal animal = new Animal(3);
    //!2. Parent class Constructor can be used by child class
    Dog d1 = new Dog(3);
  }
  
  
}
