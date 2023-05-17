package ru.itgirl.jdbcspringexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbcspringexample.model.Book;
import ru.itgirl.jdbcspringexample.repository.BookRepository;

import java.util.List;

@RestController
public class BookController<UserInfoDTO> {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }
    @GetMapping("book/{id}")
    public Book findBook(@RequestParam(value = "id", defaultValue = "1") String id) {
        return bookRepository.findBook(id);
    }

}
