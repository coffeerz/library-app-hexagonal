package com.coffee.library.adapters;

import com.coffee.library.domain.BookDTO;
import com.coffee.library.entity.Book;
import com.coffee.library.mapper.BookMapper;
import com.coffee.library.repository.BookRepository;
import com.coffee.library.spi.BookPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookJPAAdapter implements BookPersistencePort {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDTO addBook(BookDTO bookDto) {

        Book book = BookMapper.INSTANCE.bookDTOToBook(bookDto);

        Book bookSaved = bookRepository.save(book);

        return BookMapper.INSTANCE.bookToBookDTO(bookSaved);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDTO updateBook(BookDTO bookDto) {
        return addBook(bookDto);
    }

    @Override
    public List<BookDTO> getBooks() {
        return BookMapper.INSTANCE.bookListToBookDTOList(bookRepository.findAll());
    }

    @Override
    public BookDTO getBookById(Long bookId) {

        return bookRepository.findById(bookId)
                .map(BookMapper.INSTANCE::bookToBookDTO)
                .orElseThrow(() -> new RuntimeException("Not Found id: " + bookId));
    }
}
