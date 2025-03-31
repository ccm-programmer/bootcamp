public class Person {
  private String firstName;
  private String lastName;

  //! Constructor: Constructor Name = Class Name, No return type, Start with Capital letter
  public Person (String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;

  
  public String getFullName(){
    return this.lastName + " " + this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;

    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    //input -> output
    public static String getFullName(Person person){
      //person object ->output
      return person.getFullName();
    }

    // ! toString() method
    //@Override
    public String toString();
    return "Person["//
    + "firstName=" + this.firstName//
    + ", lastName" + this.lastName//
    + "]";

    // Run button --> memory (object)

    public static void main(String[] args){
      Person p1 = new Person("Sally", "Chan");
      System.out.println(p1); //Person

    }



  }
  
}
