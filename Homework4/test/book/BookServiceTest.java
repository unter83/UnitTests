package book;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;



class BookServiceTest {

    @Test
    void bookServiceTesting() {BookRepository bookRepositoryMock = mock(BookRepository.class);
       BookService service = new BookService(bookRepositoryMock);


       List <Book> books = mock(List.class);
       Book book1 = mock(Book.class);
       when(book1.getTitle()).thenReturn("Book1");
       when(book1.getAuthor()).thenReturn("Author1");
       when(service.findAllBooks()).thenReturn(books);
       when(service.findBookById("1")).thenReturn(book1);
       when(books.size()).thenReturn(3);
       assertEquals(service.findAllBooks(), books);
        assertEquals(service.findBookById("1").getTitle(), "Book1");
       assertEquals(service.findBookById("1").getAuthor(), "Author1");

        verify(bookRepositoryMock, times(1)).findAll();
        verify(bookRepositoryMock, times(2)).findById("1");

    }

}