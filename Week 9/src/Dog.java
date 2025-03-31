public class Dog {
  public static void main(String[] args) {
    
    //! We have dog objects here and 1 dog array object and 2 object references
    Dog[] dogs1 = new Dog[] {new Dog(1,"abc"), new Dog(9,"def")};
    Dog[] dogs2 = dogs1;

    dogs2[1].setName("Vincent");
    System.out.println(dogs2[1].getName());
    System.out.println(dogs1.getName());
  }
  
}
