//package com.kodilla.rest.contoller;
//
//import com.kodilla.rest.domain.BookDto;
//import com.kodilla.rest.service.BookService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class BookControllerTest {
//    @Test
//    void shouldFetchBooks(BookService bookServiceMock) {
//        //Given
//        //Wygenerowaliśmy zmienną oraz przypisaliśmy do niej mocka klasy BookService
//        BookService bookService1Mock = Mockito.mock(BookService.class);
//        //Tworzymy obiekt zmiennej - argument nazwa zmiennej mocka klasy BookService
//        BookController bookController = new BookController(bookService1Mock);
//        List<BookDto> booksList = new ArrayList<>();
//        //Mock - zwraca przykładową listę książek
//        booksList.add(new BookDto("Title 1", "Author 1"));
//        booksList.add(new BookDto("Title 2", "Author 2"));
//        //When - co chcemy przetestować
//        List<BookDto> result = bookController.getBooks();
//        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
//
//        //Then - sprawdzamy czy kontroler zwraca poprawną listę
//        assertThat(result).hasSize(2);
//    }
//
//    @Test
//    public void ShouldAddBooks() {
//        //Given
//        //Wygenerowaliśmy zmienną oraz przypisaliśmy do niej mocka klasy BookService
//        BookService bookServiceMock = Mockito.mock(BookService.class);
//        //Tworzymy obiekt zmiennej - argument nazwa zmiennej mocka klasy BookService
//        BookController bookController = new BookController(bookServiceMock);
//        List<BookDto> booksList = new ArrayList<>();
//        BookDto book = new BookDto("Tittle 1", "Author 1");
//        booksList.add(book);
//        //When - co chcemy przetestować
//        bookController.addBook(book);
//        List<BookDto> result = bookController.getBooks();
//        //Then - sprawdzamy czy kontoler zwraca poprawną listę
//        Mockito.verify(bookServiceMock).addBook(book);
//        assertEquals(book, result.get(0));
//    }
//}
//
//
//
