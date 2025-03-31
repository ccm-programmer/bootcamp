import java.util.ArrayList;
import java.util.List;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("vincent", "amy", "jenny");
    // loop + if: string length >=5 (filtering)
    List<String> results = newArrayList<>();
    for (String s : strings){
      if (s.length() >=5){
        results.add(s);
      }
    }
    System.out.println(results);  //[vincent, jenny, vincent]

    // Stream
    List<String> streamResult = strings.stream() //
    .filter (s -> s.length() >= 5). //
    collect(collectors.toList());
    System.out.println(StreamResult);

    Set<String> streamResult2 = strings.stream() //
    .filter (s -> s.length() >= 5). //
    collect(collectors.toSet());
    System.out.println(streamResult2);

    List<String> streamResult3 = strings.stream() //
    .filter (s -> s.length() >= 5 && s.charAt(0) == 'v') //
    .collect(collectors.toList());
    System.out.println(StreamResult3);

    // Stream.class (Java 8)
    Stream<String> ss = Stream.of("abcd", "def", "ijk");
    ss.collect(Collectors.toList()); // terminal operation
    // collect() is a terminal operation,
    // so you no longer to use "ss" object after the terminal operation.

    Stream<String> ss2 = Stream.of("abcd", "def", "ijk");
    ss2 = ss2.filters(s -> s.length() > 3);  // intermediate -> return new Stream<String>
    System.out.println(ss2.count); // 1

    List<String> names = new ArrayList<>(List.of("steve", "jenny", "owen"));
    names.stream().filters (s -> s.length() >= 5).collect(Collectors.toList());

    Stream<Integer> integers = Stream.empty();
    System.out.println(integers.count());

    // Create an infinite stream of random numbers
    // Stream.generate() works with limit() intermediate operation
    Stream<Double> randoms = Stream.generate(() -> (double) new Random().nextInt(100));
    System.out.println(randoms.filter(n -> n % 2 == 0).limit(10).collect(Collectors.toList()));

    // for-each in Stream
    Stream<Integer> integers2 = Stream.of(5, 10, 51, 100);
    integers2.forEach(n -> {
      System.out.println("n=" + n);
    });

    // groupBy
    List<Employee> employees = new ArrayList<>(//
      List.of(new Employee(1L, "steve", 20000, "IT")//
      , new Employee(2L, "John", 30000, "MK")//
      , new Employee(3L, "Mary", 80000, "IT")//
      , new Employee(4L, "Sally", 40000, "HR")//
      , new Employee(4L, "Tommy", 35000, "MK")//
      ));

      // "e -> e" -> Key
       //"e -> e.getSalary()" -> value
       Map<String, Integer> employeeMap = employees.stream()
       .collect(Collectors.toMap(e -> e.getName(), e -> e.getSalary()));
      employees.stream().collect(Collectors.toMap(e -> e, e -> e.getSalary()));
      System.out.println(employeeMap);

      Map<String, List<Employee>> employeeMap2 =
      employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode()));
      System.out.println(employeeMap2);
      System.out.println(employeeMap2.get("IT"));

      Map<String, Integer> employeeMap3 = 
      employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode(),
      Collectors.summingInt(e -> e.getSalary())));
      System.out.println(employeeMap3.get("MK")); //65000

      Map<String, Integer> employeeMap4 = 
      employees.stream().collect(Collectors.groupingBy(e -> e.getDeptCode(),
      Collectors.avergingInt(e -> e.getSalary())));
      System.out.println(employeeMap4.get("IT")); //50000 

      //Question
      long count = Stream.of(4,5,6)//
      .map(n -> {
        System.out.println("mapping...");
        return n + 1; 
      }).count();
      // Stream: Terminal operation may determine if intermediate operation executes
      System.out.println("count=" + count);

    public static class Employee {
      private long id;
      private String name;
      private int salary;
      private String deptCode;  //IT, MK, HR, etc...

      public Employee(Long id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptCode = deptCode;
      }

      public String getName(){
        return this.name;
      }
      public int getSalary() {
        return this.salary;
      }
      public String getDeptCode(){
        return this.DeptCode;
      }
    }



  
  
  
  
  }
  
}
