package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//
@ExtendWith(MockitoExtension.class)

public class LibrarianTest {
  
  @Mock
  private Library mockedLibrary;
  @InjectMocks
  private Librarian librarian;

  //@Spy is a kind of integration test.
  // A real object, but you can override some of methods
  
  @Test
  void testAddBook(){
    Mockito.when(this.mockedLibrary.add(new Library.Book(1,"ABC")))
    .thenReturn(1000);

    Mockito.when(this.mockedLibrary.remove(new Library.Book(1,"ABC")))
    .thenReturn(2000);

    // Librarian librarian = new Librarian(mockedLibrary); 上面@InjectMocks之後就唔使寫

    //Your test
    int actualResult = librarian.addBook(new Library.Book(1,"ABC"));
    Assertions.assertEquals(1005, actualResult);

    // Verify if the above process does really called add(new Library.Book(1,"ABC"))
    verify(mockedLibrary, times(1)).add(new Library.Book(1, "ABC"));
  }
}
