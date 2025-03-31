package DemoClass;

public class Book{
  private String name;
  private String author;
  private Double price;

  //getter -->查詢; setter --> 設定
  public String getBookName(){
    return this.name;
  }

  public String getAuthor(){
    return this.author;
  }

  public Double getPrice(){
    return this.price;
  }

  // return type/ method signature
  public void setBookName (String BookName){
  this.name = BookName;
}

public void setAuthorName (String AuthorName){
  this.author = AuthorName;
}

public void setBookPrice (Double BookPrice){
  this.price = BookPrice;
}







}
