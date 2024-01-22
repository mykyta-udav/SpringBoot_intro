package com.example.bookshoponline;

import com.example.bookshoponline.model.Book;
import com.example.bookshoponline.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIntroApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("The Lord of the Rings");
            book.setAuthor("J. R. R. Tolkien");
            book.setDescription("Bring ring to the mount");
            book.setPrice(BigDecimal.valueOf(100));
            book.setIsbn("fantasy books");
            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }

}
