package City;

public interface Flyable {
  void fly();

  // Anonymous Inner Class
  // Produces a one-off object with method implementation

    public static void main(String[] args) {
    Flyable superman = new Flyable(){
      @Override
      public void fly(){
        System.out.println("Superman is flying...");
      }
    };
    superman.fly();  // Superman is flying...
    
  }

  
}
