import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
  private Long id;  // Object (Long), Primitive (long)
  private Boolean isVIP;

  public Customer (Long id, Boolean isVIP){
    this.id = id;
    this.isVIP = isVIP;
    this.order = new LinkedList<>();
    //...
  }
  
  public Boolean getisVIP() {
    return this.isVIP;
  }

  public void UpdateOrder (Long orderId, Double newAmount){
    // for-each does not support add/ remove/ modify the object/ object value
  for (int i = 0; i < this.orders.size(); i++){
    if(this.orders.get(i).getId() == orderId){

    }
  }
  }

  customers.get(0).getOrders().get(0).setTotalAmount(999.0);
  

  @Override
  public String toString(){
  return "Customer[" //
        + "id=" + this.id //
        + ", totalAmount=" + this.totalAmount() //
        + "]"};

  public void addOrder(Order order){
    //...
    this.order.add(order);
  }

  public static void main(String[] args) {
// Create Order List with the following orders
    // Customer 1
    // 1. Order (1L, 100.0)
    // 2. Order (2L, 95.0)
    // 3. Order (3L, 20.0)

    Customer c1 = new Customer(1L, false);
    c1.addOrder(new Order (1L, 100.0));
    c1.addOrder(new Order (2L, 89.0));
    c1.addOrder(new Order (3L, 5.0));

    // Customer 2
    // 1. Order (4L, 1000.0)
    // 2. Order (5L, 89.0)
    // 3. Order (6L, 5.0)
    Customer c2 = new Customer(2L, false);
    c2.addOrder(new Order (4L, 1000.0));
    c2.addOrder(new Order (5L, 89.0));
    c2.addOrder(new Order (6L, 5.0));


    //Stream
    // Based on Customer List, find the customers with any order amount > 800.0
    List<Customer> customer2 = customers.stream() //
      .filter (c -> {
        for 
      if (o.getTotalAmount() >= 800.0)
        return true;}
        return false;
      })
      .collect(Collectors.toList());


// Create a new Class VipCustomer
// Return List<VipCustomer>
// Filter List <Customer> to find vip customer

  List<VipCustomer> vipCustomers = customers.stream() //
      .filter (c -> c.isVip())
      .map(c -> {
        VipCustomer vCustomer = new VipCustomer 
      })
      .collect(Collectors.toList());
      
  //Questions: update order details in customer list, any impact to vipCustomer


  }
  

