public enum OrderStatus {
  PAID(1), PENDING_FOR_SHIP(2), SHIPPING(3), DELIVERED(4),;

  private int value;

  private OrderStatus(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public OrderStatus next(){
    for (OrderStatus status : OrderStatus.value()){
      if (status.getValue() = this.value+1)
      return status;
    }
    return this;
  }
  
  public static void main(String[] args) {
    OrderStatus.PAID.next();

    for(OrderStatus status:OrderStatus.values()){
      System.out.println(status);  //toString
      System.out.println(status.name());
    }

    System.out.println(OrderStatus.PAID.next().name());
    System.out.println(OrderStatus.PAID.next().next().name());
    System.out.println(OrderStatus.DELIVERED);

    OrderStatus.DELIVERED

    // valueOf -> static method
    // find the enum object, which has the same name you provided
    System.out.println(OrderStatus.valueOf("PAID").name()); 


  }
  
}
