public abstract class Animal {  //abstract can't create new object
  private int age;
  
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
    Animal animal = new Animal(3); // cannot be "new" after "abstract"!!
    //!2. Parent class Constructor can be used by child class
    Dog d1 = new Dog(3);
  }

  //!Abstract Class
  //1. Cannot be "new"
  //2. Share the common attribute (private attribute, public method)
  //3. Parent constructor can be used by child class
  //4. parent object instance method can be accessed by the child age
  //5. Define abstract methods (without implementation)

  

  
  
}