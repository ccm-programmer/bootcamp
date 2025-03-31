import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VipCustomer {
  private Long id;  // Object (Long), Primitive (long)
  private List<Order> orders;

  public vipCustomer (Long id){
    this.id = id;
    this.order = new ArrayList<>();
    //...
  }

  public void addOrder(Order order){
    //...
    this.order.add(order);
  }

  public List<Order> getOrders(){
    return this.orders;
  }
}
