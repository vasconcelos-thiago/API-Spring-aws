package com.example.apispring.controllers;
import com.example.apispring.domain.Book;
import com.example.apispring.services.BookService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "https://book-test-api.s3.us-east-2.amazonaws.com/books1.json", maxAge = 3600)

@RestController
@RequestMapping("/api/books")


public class BookController {
    private final BookService service;
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks() {

        List<Book> books = this.service.getBooksLibrary();
        System.out.println(books);
        return ResponseEntity.ok().body(books);


    }
}
