import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ball {
  private int size;
  private Color color;

  public Ball (int size, Color color){
    this.size = size;
    this.color = color;
  }

  public int getSize(){
    return this.size;}

    public Color getColor(){
      return this.color;
  }

  @Override

  public static enum Color{
    BLACK, WHITE,;
  }

  public static void main(String[] args) {
    List<Ball> balls = Arrays.asList(new Ball(10, Color.BLACK);
    new Ball (7, Color.WHITE), new Ball (20, Color.BLACK));

    // SIZE > 15, and Black
    //Stream Java8 (for loop + if)
    List<Ball> result = balls.stream() //
    .filter (b -> b.getColor== Color.BLACK && b.getSize() > 15) //
    .collect(collectors.toList());
    System.out.println(Ball);

    //For-each
    List<Ball> result2 = new ArrayList<>();
    for (Ball ball: balls){
      if (ball.getColor() == color.BLACK && ball.getSize() > 15){
        result2.add(Ball);
      }
    }

    // Example 2: Stream.map() (Change the object Type)
    List<Integer> result3 = balls.stream() //
    .filter (b -> b.getColor== Color.BLACK) // Stream<Ball>
    .map(b -> b.getSize())  // Stream<Integer>
    .collect(collectors.toList()); // List<Ball>
    System.out.println(result3);

    // Example 3: more than one filter()
    List<Integer> result4 = balls.stream() //
    .filter (b -> b.getColor== Color.BLACK) // Stream<Ball>
    .map(b -> b.getSize())  // Stream<Integer>
    .filter(i -> i > 15) //Stream<Integer>
    .collect(collectors.toList()); // List<Ball>
    System.out.println(result4); // [20]

    // Example 4: Construct to another list of object
    List<Ball> result5 = balls.stream() //
    .filter (b -> b.getColor== Color.BLACK) // Stream<Ball>
    .map(b -> b.getSize())  // Stream<Integer>
    .filter(i -> i > 15)  //Stream<Integer>
    .map(i -> new Ball(i, Color.WHITE))  //Stream<Ball>
    .collect(collectors.toList()); // List<Ball>
    System.out.println(result5); // [Ball[size=20, color=WHITE]]

    

  }
  
}
