public interface Swimable { //contract
  // ! Interface
  // 1. All methods are without implementation (abstract method)
  // 2. No instance variable
  // 3. No constructor
  // 4. Can hold static variable / methods


  // implicity public static final
  int x = 10;

  void swim();  //不需要自行fulfill合約

  // ! After Java 8 (2014)
  // 1. static method
  static int sum (int x, int y){
    return x + y;
  }

  // 2. default method
  default void eat(){
    System.out.println("eat() method inside inteface");
  }

  // ! Assignment
  // 2 classes and at least 2 interfaces
  // attributes, getter,setter, constructor 





  
}
