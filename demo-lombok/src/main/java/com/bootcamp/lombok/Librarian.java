package com.bootcamp.lombok;

// Librarian is object -> Library object -> Book ArrayList object
public class Librarian {
  private Library library;

  // Dependency Injection
  public Librarian (Library library){
    this.library = library;
  }

  // Unit Test complete?
  // Result from others +add value
  public int addBook(Library.Book book){
    return this.library.add(book) +5;
  }
  
}
