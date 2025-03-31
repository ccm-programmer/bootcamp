public record book {String author, String title
  // record, for creating immutable object
  // 1. No setter
  // 2. All-arg constructor
  // 3. getter
  // 4, No empty constructor
  // 5. Support toString() 
  // 6. Support equals()
  // 7. Support hashCode()
  // 8. Support instance & static custom method
  // 9. Support static variable

public static void main(String[] args){
  Book book = new Book("Jimmy Chab", "ABC")
  System.out.println(book.author()); //getter
  System.out.println(book.title ()); //getter
  System.out.println(book.toString()); //getter

  Book book2 = new Book("Jimmy Chab", "ABC"){
  System.out.println(book.author()); //getter
  System.out.println(book.title ()); //getter
  System.out.println(book.toString()); //getter
}
}
