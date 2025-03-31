import java.util.function.Function;

public class DemoLambda {
  public static void main(String[] args) {
    // Lambda Expression: 
    // 1. Create one-off object for Flyable Interface
    // 2. Only for those interface
    // "()", because fly() has NO parameters
    // "->", implementation

    Flyable superman = () -> System.out.println("Superman is flying...");
    superman.fly();
    Flyable superwoman = () -> System.out.println("Superwoman is flying...");
    superwoman.fly();

    Math1 addManager = (a,b) -> a+b;
    Math1 subtract = (a,b) -> a-b;
    Math1 multiply = (a,b) -> a*b;
    Math1 divide = (a,b) -> a/b;
    System.out.println(addManager.operate(2,1));
    System.out.println(subtract.operate(2,1));
    System.out.println(multiply.operate(2,3));
    System.out.println(divide.operate(8,2));

    // Multiple Lines implementation, you have to use bracket{}
    Math1 multiply2 = (a,b) -> {
      int value = a * b;
      return value;
    };
    // Java 8 Built-in Functional Interface
    // Function<T, R> (1 in, 1 out)
    Function<String, Integer> stringLength = s -> s.length();
    Function<Double, Double> circleArea = radius -> radius * radius * 3.14;
    
    System.out.println(circleArea.apply(3.0)); //28.26
    System.out.println(circleArea.apply(5.0)); //78.5

    Function<String, List<String>> splitString = s -> {
      String first = s.substring(0, s.length() / 2);  
      String second = s.substring(s.length() /2, s.length());
      return Arrays.asList(first, second);};

      System.out.println(splitString.apply("hello")); // [he, llo]
      System.out.println(splitString.apply("abcdef")); // [abc, def]

      // BiFunction
      BiFunction<String, String, Integer> stringLength2 =
      (s1, s2) -> s1.length() + s2.length();
      System.out.println(stringLength2.apply("abc", "ijk", "def")); //6

      // SuperFunction
      SuperFunction<String, String, String, String> firstChar =
      (s1, s2, s3) -> "" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0);
      System.out.println(firstChar.apply("abc", "ijk", "def"));

      // Consumer (has input, no output)
      Consumer<String> printString = s -> System.out.println(s);
      printString.accept("hello");

      Consumer<List<String>> printStrings = strings -> {
        for (String s : strings){
          System.out.println(s);
        }
      };
      printStrings.accept(Arrays.asList("hello", "abc", "Jimmy"));

      BiConsumer<String, Integer> charAt =
      (s, i) -> System.out.println(s.charAt(i));
      charAt.accept("hello", 2);

      // Supplier (no input, only output)
      Supplier<Integer> random = () -> new Random().nextInt(100)+1;
      System.out.println(random.get());

      // Predicate
      Predicate<String> isTooLong = s -> s.length() >=5;
      System.out.println(isTooLong.test("Amy"));  //false
      System.out.println(isTooLong.test("Vincent"));  //true

      //BiPredicate
      BiPredicate<String, String> equalString = (s1, s2) -> s1.equals.s2;
      System.out.println(equalString.test("hello", "hello")); //true
      System.out.println(equalString.test("hello", "abc")); //false

      Function<Double, Double> squareArea = length -> length * length;
      System.out.println(squareArea.apply(9.0));  //81.0

      UnaryOperator<Double> squareArea2 = length -> length * length;
      System.out.println(squareArea2.apply(9.0));  //81.0

      //BinaryOperator
      BiFunction<Double, Double, Double> rectArea = (l1, l2) -> l1 * l2;
      System.out.println(rectArea.apply(3.3, 4.2));

      BinaryOperator<Double> rectArea2 = (l1, l2) -> l1 * l2;
      System.out.println(rectArea2.apply(3.3, 4.2));

      // Application - Consumer
      List<String> names= Arrays.asList("amy", "jenny", "susan");
      for (String s : names){
        System.out.println(s);
      }

      names.forEach(name -> System.out.println(name));

      //
      Map<String, String> nameMap = new HashMap<>();
      nameMap.put("amy", "hello");
      nameMap.put("jenny", "goodbye");
      nameMap.computeIfAbsent("amy", s -> "default");
      System.out.println(nameMap); //{jenny=goodbye, amy=hello}

      nameMap.computeIfAbsent("susan", s -> "default");
      System.out.println(nameMap); //{susan=default, jenny=goodbye, amy=hello}
    
      if (nameMap.get("susan") == null){
        nameMap.put("susan", "default");

        //Example
        List<Character> grades = Arrays.asList('A', 'C', 'B', 'A', 'D', 'E');

        // A -> 50, B -> 40, C -> 30, D -> 20, E -> 10
        Map<Character, Integer> gradeMap = new HashMap<>();
        for (Character c : grades){
          // if key exists, add the new value to the old value
          // if key not exists, put new entry with new value
          switch (c){
            case 'A':
            gradeMap.merge(c, 50, (o, n) -> o + n);
            break;
            case 'B':
            gradeMap.merge(c, 40, (o, n) -> o + n);
            break;
            case 'C':
            gradeMap.merge(c, 30, (o, n) -> o + n);
            break;
            case 'D':
            gradeMap.merge(c, 20, (o, n) -> o + n);
            break;
            case 'E':
            gradeMap.merge(c, 10, (o, n) -> o + n);
            break;
            default:
            gradeMap.merge(c, 0, (o, n) -> o + n);
            break;
            }
           }
      System.out.println(gradeMap);  //{A = 100, B = 40, C = 60, D = 20}

      // Predicate -> and or
      Predicate<Integer> isElderly = age2 -> age2 > 65;
      Predicate<Integer> isChild = age3 -> age3 < 12;
      Predicate<Integer> withDiscount = isElderly.or(isChild);
      System.out.println(withDiscount.test(66)); //true
      System.out.println(withDiscount.test(10)); //true
      System.out.println(withDiscount.test(18)); //false

      Comparator<String> descendingOrder = (s1,s2) -> s1.compareTo(s2) > 0 ? -1:1;
      List<String> strings = Arrays.asList("abc", "zyx", "ijk");
      Collections.sort(strings, descendingOrder);
      System.out.println(strings); 

          }
    
    }
  
}
