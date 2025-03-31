import java.util.List;

public class DemoMethodReference {
  // 呢個topic可以知道、識睇就OK啦~
  public static void main(String[] args) {
    // Method Reference (Java 8)

    // Example 1: static method
    List<Integer> numbers = new ArrayList<>(List.of(1,3,4,5,9));
    numbers.forEach(e -> System.out.println(e)); // Lambda
    numbers.forEach(System.out::println); // method reference

    // Example 2: instance method
    String name = "Peter";
    Supplier<Integer> nameLength = () -> name.length();  //lambda
    System.out.println(nameLength.get()); //5
    nameLength = name::length; //method reference
    System.out.println(nameLength.get());  //5

    // Example 4: instance method (with params)
    String word = "hello";
    BiFunction<String, String, Integer> compareToString = (s1, s2) -> s1.compareTo(s2);
    System.out.println(compareToString.apply(word, "hello"));  //0

    BiFunction<String, String, Integer> compareToString2 = String::compareTo;
    System.out.println(compareToString2.apply(word, "hello"));  //0

    // Example 5: Create Object
    Function<String, Integer> convertToInteger = s -> new Integer(s);
    System.out.println(convertToInteger.apply("123"));
    Function<String, Integer> convertToInteger2 = Integer::new;
    System.out.println(convertToInteger2.apply("123"));
    Function<String, Integer> convertToInteger3 = Integer::valueOf;
    System.out.println(convertToInteger3.apply("123"));



  }
  
}
