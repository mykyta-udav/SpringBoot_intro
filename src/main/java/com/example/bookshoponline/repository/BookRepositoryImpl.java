package com.example.bookshoponline.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;
}
