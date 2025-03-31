import java.util.Objects;

public class Father extends GrandFather implements Swimable, Walkable {
  private String name;

  public Father(String name){
    this.name = name;
  }

  public Father(String name, double weight, double height){
    super(height,weight);
    this.name = name;
  }

  public String getName(){

  }

  // ! If you write down the @override here...
  // 1. Compiler will help check the parent class, ensure there is same method for overriden
  // 2. Readability

  @Override
  public void swim(){
    System.out.println("Father is swimming...");
  }

  @Override
  public void walk(){
    System.out.println("Father is walking...");
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
      if(!(obj instanceof Father))
      return false;
      Father father = (Father) obj;
      return Objects.equals(father.getName(), this.getName())
      && Objects.equals(father.getHeight(), super.getHeight())
      && Objects.equals(father.getWeight(), super.getWeight());
    }    
  }

  // ! Java case-sensitive on method name
  @Override


  public static void main(String[] args) {
    Father f1 = new Father("Vincent");
    System.out.println(Swimable.x);

    // Poly
    Swimable father = new Father("Oscar");
    // ! During compile time, only swim() method is visible for father object
    father.swim();
    // X cannot use father.walk();
    Swimable father2 = new Father("Steve");
    father2.walk();
    // X cannot use father.swimable();

    // Father & Walkable has relationship
    // Father & Swimable has relationship
    // ! Walkable & Swimable has no relationship
    // Walkable father3 = father;

    //Father father4 = father; // Swimable cannot assign to Father. Compiler this "father" may not be a Father object.
    // If we insist and confirm the "father" is a Father object, and you want to convert its type.
    Father father4 = (Father) father;
    father4.swim();
    father4.walk();

    Walkable father5 = father4;
    father5.walk();
    // X father5.swim();

    // ! Not a good practice
    Swimable father6 = (Father) father5; // from walkable object -> Father object -> Swimable

    System.out.println(Swimable.sum(10,2));

    Father father7 = new Father("Peter");
    father7.eat();  //eat() method inside the interface

    new Father("Kenny").eat();

    GrandFather father8 = (Father) father6;

    //Parent Object cannot be assigned to Child Object reference
    
    Object father = new Father ("Vincent");
    //father.drive();
    Father realFather

  }
}
