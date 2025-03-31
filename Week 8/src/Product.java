public abstract class Product {  //Product 是抽像的名詞, 所以用 abstract class 形容, 無得new Product()
  private String name;
  private double price; // Encapsulation

  public product (String name, double price);

  // getter, setter

  public String name(){
  return this.name;}

  public double price(){
    return this.price;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPrice(double price){
    this.price = price;
  }

  // abstract method, 呢個 method 得個名
  public abstract String getProductType();

  

}
