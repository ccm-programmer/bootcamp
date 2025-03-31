import java.util.ArrayList;
import java.util.List;

public class Car {
  private String model;
  private int year;

  public Car (String model, int year){
    this.model = model;
    this.year = year;
  }

  public String getModel(){
    return this.Model;
  }

  public static void main(String[] args) {
    Car c1 = new Car("tesla", 2020);
    Car c2 = new Car("tesla", 2022);
    Car c3 = new Car("toyota", 2018);
    List<Car> cars = new ArrayList<>();
    cars.add(c1);
    cars.add(c2);
    cars.add(c3);
    long teslaCount = cars.stream().filter(c -> "testla".equals(c.getModel())).count();
    System.out.println(teslaCount);

    // distinct(): remove duplicate
    // Find all models in cars
    // Approach 1
    List<String> models = cars.stream()//
    .map((c -> c.getModel()))//
    .distinct()//
    .collect(Collectors.toList());
    System.out.println(models);

    // Approach 2
    Set<String> models2 = cars.stream()//
    .map((c -> c.getModel()))//
    .collect(Collectors.toSet());
    System.out.println(models2);

    // sorted(): descending year
    List<Car> sortedCars = cars.stream()  //Stream<Car>
    .sorted((c10, c20) -> c10.getYear() > c20.getYear() ? -1:1)
    .collect(Collectors.toList());
  }

}
