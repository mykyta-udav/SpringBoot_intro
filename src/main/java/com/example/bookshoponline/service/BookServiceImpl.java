package com.example.bookshoponline.service;

import com.example.bookshoponline.dto.BookDto;
import com.example.bookshoponline.dto.CreateBookRequestDto;
import com.example.bookshoponline.exception.EntityNotFoundException;
import com.example.bookshoponline.mapper.BookMapper;
import com.example.bookshoponline.model.Book;
import com.example.bookshoponline.repository.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto createBookRequestDto) {
        Book book = bookMapper.createBookRequestDtoToBook(createBookRequestDto);
        Book savedBook = bookRepository.save(book);
        return bookMapper.bookToBookDto(savedBook);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::bookToBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id: " + id));
        return bookMapper.bookToBookDto(book);
    }
}
