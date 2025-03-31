public class NumberPrinter<T extends Number> { //extends abstract class
  private T value;

  public NumberPrinter(){

  }

  public NumberPrinter(T value){
    this.value = value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public static void main(String[] args) {
    NumberPrinter<Long> longPrinter = new NumberPrinter<>();
  }
}
