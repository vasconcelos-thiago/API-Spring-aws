package com.example.apispring.services;
import com.example.apispring.domain.Book;
import com.example.apispring.feing.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookClient bookClient;

    public BookService(BookClient client) {
        this.bookClient = client;
    }


    public List<Book> getBooksLibrary() {
        return this.bookClient.getBooks();


    }

}
