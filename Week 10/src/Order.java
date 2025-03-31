public class Order {

  public static final int STATUS_PAID = 1;
  public static final int STATUS_PENDING_FOR_SHIP = 2;
  public static final int STATUS_SHIPPING = 3;
  public static final int STATUS_DELIVERED = 4;

  private int orderStatus;
  // ! Best design for status (enum)

  public Order(int orderStatus){
    this.orderStatus = orderStatus;
  }

  // public void setOrderStatus(int orderStatus){
  //   this.orderStatus = orderStatus;
  // }

  // ! Encapsulation 封裝, 只可以按我寫的要求去改我D野
  public void nextStatus(){
    this.orderStatus++;
  }
  
  public static void main(String[] args) {
    Order order1 = new Order(STATUS_PAID);


  }
}
