public class Box <T>{
  private T value; // null

  public Box(T value){
    this.value = value;
  }

  public static <T> Box <T> empty(){
    return new Box(null);
  }
  
}
