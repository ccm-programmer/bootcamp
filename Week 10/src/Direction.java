public enum Direction {
  EAST(1), //
  SOUTH(2), //
  WEST(-1), //
  NORTH(-2), //
  ;

  // instance method

  private int value;

  private Direction(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
  
  public boolean oppsite(Direction direction){
    return this.value * direction.getValue() == -1;
  }

  public static void main(String[] args) {
    System.out.println(Direction.WEST.oppsite(Direction.EAST)); //true
  }
  
}
