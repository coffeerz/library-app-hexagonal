package com.coffee.library.mapper;

import com.coffee.library.domain.BookDTO;
import com.coffee.library.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToBookDTO(Book book);

    Book bookDTOToBook(BookDTO bookDTO);

    List<BookDTO> bookListToBookDTOList(List<Book> bookList);

    List<Book> bookDTOToBookList(List<BookDTO> bookDTOList);
}
