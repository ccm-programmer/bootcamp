public abstract class Machine {
 
  private String color;

  public Machine(){
    this.color="BLACK";
  }

  public Machine(String color){
    this.color=color;
  }
  
  // ! abstract method implicitly public
  abstract void start();
  abstract void stop();

  //getter, setter must follow attribute

  public String getColor(){
    return this.color;
  }

  /* 
  public final String getColor(){
    return this.color;
  }
  */
  //!"final" method cannot be overriden by child class
  //!Porjector.class can access abc() method, but it cannot override it.
  public final int abc(){
    return 3;
  }
  







}
