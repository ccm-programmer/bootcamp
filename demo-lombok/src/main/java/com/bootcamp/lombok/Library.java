package com.bootcamp.lombok;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Library {
  private List<Book> books;

  public Library(){
    this.books = 
  }

  @Getter
  @Setter
  @AllArgsConstructor
  public static class Book{
    private int id;
    private String name;
  }

  
  
}
