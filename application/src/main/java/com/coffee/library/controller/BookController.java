package com.coffee.library.controller;

import com.coffee.library.domain.BookDTO;
import com.coffee.library.ports.api.BookServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookServicePort bookServicePort;

    @PostMapping
    public BookDTO addBook(@RequestBody BookDTO bookDto) {
        return bookServicePort.addBook(bookDto);
    }

    @PutMapping
    public BookDTO updateBook(@RequestBody BookDTO bookDto) {
        return bookServicePort.saveOrUpdateBook(bookDto);
    }

    @GetMapping("/{id}")
    public BookDTO getBookByID(@PathVariable long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping("/get")
    public List<BookDTO> getAllBooks() {
        return bookServicePort.getBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }
}
