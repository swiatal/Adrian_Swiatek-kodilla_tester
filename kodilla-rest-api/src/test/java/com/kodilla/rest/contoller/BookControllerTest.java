package com.kodilla.rest.contoller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class BookControllerTest {
    @Test
    public void shouldFetchBox() {
        //given
    //wygenerowaliśmy zmienna i przypisaliśmy do niej mocka klasy BookService
            BookService bookServiceMock = Mockito.mock(BookService.class);
            //Tworzymy obiekt zmiennej - argument nazwa zmiennej mocka klasy BookService
            BookController bookController = new BookController(bookServiceMock);
            List<BookDto> booksList = new ArrayList<>();
            //MOck - zwraca przykładową listę ksiąćek
            booksList.add(new BookDto("Title 1", "Author 1"));
            booksList.add(new BookDto("Title 2", "Author 2"));
            Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

            //when - co chcemy przetestować
            List<BookDto> result = bookController.getBooks();

            //then - sprawdzamy czy kontroler zwraca poprawną listę
            assertThat(result).hasSize(2);
        }
        @Test
    public void shouldAddBooks() {
        //given
            BookService bookServiceMock = Mockito.mock(BookService.class);
            BookController bookController = new BookController(bookServiceMock);
            //List<BookDto> booksList = new ArrayList<>();
            BookDto book = new BookDto("Tittle 1", "Author 1");
            //Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

            //when
            bookController.addBook(book);
            //List<BookDto> result = bookController.getBooks();

            //then
            Mockito.verify(bookServiceMock,Mockito.times(1)).addBook(book);
        }
    }

