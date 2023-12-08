package com.book.store.controller;

import com.book.store.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping("/")
    public ResponseEntity<BookDto> getBook(){

        return new ResponseEntity<>(BookDto
                .builder().title("Java").build(), HttpStatus.OK);
    }
}
