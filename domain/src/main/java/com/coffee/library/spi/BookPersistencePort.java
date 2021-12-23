package com.coffee.library.spi;

import com.coffee.library.domain.BookDTO;

import java.util.List;

public interface BookPersistencePort {

    BookDTO addBook(BookDTO bookDto);

    void deleteBookById(Long id);

    BookDTO updateBook(BookDTO bookDto);

    List<BookDTO> getBooks();

    BookDTO getBookById(Long bookId);
}
