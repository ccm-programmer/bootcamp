public class Electronics extends Product {


  @Override  //比compiler知道, 重新定義呢個 method 點用?
  public String getProductType(){
    return "Electronics";
  }  // extends used to Inheritance with abstract class Product

  @Override  // Override class object
  public String toString(){
    return super.toString() + "warrantyPeriod: " + 
  }
  
}
