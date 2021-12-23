package com.coffee.library.service;

import com.coffee.library.domain.BookDTO;
import com.coffee.library.ports.api.BookServicePort;
import com.coffee.library.spi.BookPersistencePort;

import java.util.List;

public class BookServiceImpl implements BookServicePort {

    private BookPersistencePort bookPersistencePort;

    public BookServiceImpl(BookPersistencePort bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        return bookPersistencePort.addBook(bookDTO);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDTO saveOrUpdateBook(BookDTO bookDTO) {
        return bookPersistencePort.updateBook(bookDTO);
    }

    @Override
    public List<BookDTO> getBooks() {
        return bookPersistencePort.getBooks();
    }

    @Override
    public BookDTO getBookById(Long bookId) {
        return bookPersistencePort.getBookById(bookId);
    }
}
