package com.example.bookshoponline.repository;

import com.example.bookshoponline.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
