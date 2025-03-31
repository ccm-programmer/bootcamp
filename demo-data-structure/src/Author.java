public class Author {
  private String name;

  public Author (String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Author))
  }
  
}
