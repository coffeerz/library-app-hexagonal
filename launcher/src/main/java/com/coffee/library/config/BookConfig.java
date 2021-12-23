package com.coffee.library.config;

import com.coffee.library.adapters.BookJPAAdapter;
import com.coffee.library.ports.api.BookServicePort;
import com.coffee.library.service.BookServiceImpl;
import com.coffee.library.spi.BookPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookPersistencePort bookPersistencePort() {
        return new BookJPAAdapter();
    }

    @Bean
    public BookServicePort bookService() {
        return new BookServiceImpl(bookPersistencePort());
    }
}
