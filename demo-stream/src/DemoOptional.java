import java.util.Optional;

public class DemoOptional {
  // 1. Optional<T> MUST be used in return type for method.
  // 2. Optional<T> MUST NOT be used in parameter.
  // 3. Optional<T> MUST NOT be used in Class Attribute Type.

  // Some other ways to resolve optional object
  // 1. isPresent() -> get()
  // 2. ifPresent()
  ss.ifPresent(s -> System.out.println(s.length()));
  // 3. orElse()
  String afterUnbox = ss.orElse("default");
  System.out.println(afterUnbox);  //abchello
  // 4. orElseGet()
  String afterUnbox2 = ss.orElseGet(() -> "default");
  System.out.println(afterUnbox2);
  // 5. orElseThrow()
  String afterUnbox3 = concat2("abc", "def").orElseThrow(() -> new IllegalArgumentException());
  System.out.println(afterUnbox3);  //abcdef

  public static void main(String[] args) {
    // Scenario 1 (without Optional)
    String result = concat(null, "hello");
    if (result.length() > 0)
    System.out.println("successful.");

    // Scenario 2 (with Optional)
    String x = null;
    Optional<String> ss = concat2.(x, "hello");
    if (ss.iPresent()){
      System.outprintln(ss.get().length());
    } else{
      System.out.println("I know it is a null value...do nothing");

    }
   }
  
   // 第 1 種寫法
   // Acceptable Design: Return null or Throw Exception
   public static String concat(String x, String y){
    if (x == null)
    //throw new IllegalArgumentException();
    return null;
    return x.concat(y);
   }

   // 第 2 種寫法
   public static Optional<String> concat2 (String x, String y){
    if (x == null)
    return Optional.empty;
    return Optional.of(x.concat(y));
   }

   // Wrong Design: Parameter should be easy
   public static String concat2(Optional<String> x, Optional<String> y){
    if (x ==null || !x.isPresent() || !y.isPresent())
    return null;
    return Optional.of(x.concat)
   }
}
