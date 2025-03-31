// what is Enum?
/*
 * 1. Each Constant is a Singleton
 * 
 * 2. Fixed Set of Constants
 * 
 * 3. Custom Properties and Methods
 * 
 * 4. Type-Safe (no need equals and hashCode)
 *
 * 5. Enum Constructor private by default
 */
// java auto make it is a unique Object

public enum Direction {
  // private String[] directions = {"east", "south", "west", "north"};
  EAST(1),
  SOUTH(1), 
  WEST(-1), 
  NORTH(-1);

  private int direction;

  private Direction(int i){
    this.direction = i;
  }

  public int getDirection(){
    return this.direction;
  }
  
  public boolean isOpposite(Direction direction){
    return this.getDirection() * direction.getDirection() == -1;
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.getDirection());
    System.out.println(Direction.SOUTH.getDirection());
    System.out.println(Direction.WEST.getDirection());
    System.out.println(Direction.NORTH.getDirection());
  }

  public String checkDirection()
}
