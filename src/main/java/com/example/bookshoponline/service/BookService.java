package com.example.bookshoponline.service;

import com.example.bookshoponline.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
