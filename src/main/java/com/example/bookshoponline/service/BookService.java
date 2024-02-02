package com.example.bookshoponline.service;

import com.example.bookshoponline.dto.BookDto;
import com.example.bookshoponline.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto createBookRequestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
