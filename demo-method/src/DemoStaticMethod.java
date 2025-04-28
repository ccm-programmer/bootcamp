// 15-Apr-2025
// method = a block of reusable code that is executed when called ()

public class DemoStaticMethod {
  public static void main(String[] args) {
    
    String name = "Ivy";
    int age = 18;

    HappyBirthday(name, age);
  }

  //below is anothe method, seperate from above
  static void HappyBirthday(String name, int age){ //set up parameters
  System.out.println("Happy Birthday to you!");
  System.out.printf("Happy Birthday dear %s!\n", name);
  System.out.printf("You are %d years old! \n", age);
  System.out.println("Happy Birthday to you! \n");

  }
}
