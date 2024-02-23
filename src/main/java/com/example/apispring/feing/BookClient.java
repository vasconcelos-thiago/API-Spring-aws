package com.example.apispring.feing;
import com.example.apispring.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="book-test-api", url="https://book-test-api.s3.us-east-2.amazonaws.com/books1.json")

public interface BookClient {

    @GetMapping("")
    List <Book> getBooks();
}
