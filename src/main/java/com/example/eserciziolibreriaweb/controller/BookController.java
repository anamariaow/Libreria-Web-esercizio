package com.example.eserciziolibreriaweb.controller;

import com.example.eserciziolibreriaweb.entity.Book;
import com.example.eserciziolibreriaweb.service.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ArrayList<Book> getBookArrayList() {
        return bookService.getBookArrayList();
    }
    @PostMapping("/library")
    public Book addBook(@RequestBody Book book){
        bookService.addBook(book);
        return book;
    }

}
