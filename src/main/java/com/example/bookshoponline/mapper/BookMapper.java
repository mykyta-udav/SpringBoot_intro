package com.example.bookshoponline.mapper;

import com.example.bookshoponline.config.MapperConfig;
import com.example.bookshoponline.dto.BookDto;
import com.example.bookshoponline.dto.CreateBookRequestDto;
import com.example.bookshoponline.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {

    Book createBookRequestDtoToBook(CreateBookRequestDto createBookRequestDto);

    BookDto bookToBookDto(Book book);
}
