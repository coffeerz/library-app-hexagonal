package com.coffee.library.ports.api;

import com.coffee.library.domain.BookDTO;

import java.util.List;

public interface BookServicePort {

    BookDTO addBook(BookDTO bookDTO);

    void deleteBookById(Long id);

    BookDTO saveOrUpdateBook(BookDTO bookDTO);

    List<BookDTO> getBooks();

    BookDTO getBookById(Long bookId);
}
