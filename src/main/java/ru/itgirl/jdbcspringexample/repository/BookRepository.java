package ru.itgirl.jdbcspringexample.repository;


import org.springframework.web.bind.annotation.PathVariable;
import ru.itgirl.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBook(String id);
}
