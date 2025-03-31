public  class Dog2 extends Animal {
  // private int age;

  public Dog(int age, String name){
    // this.age = age;
    super(age);  //super go first

    public void setName(String name){
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Dog2 d1 = new Dog2();



    //1. constructor

    //2. setter
    d1.setAge(10);

    System.out.println(d1.getAge());
  }
}
