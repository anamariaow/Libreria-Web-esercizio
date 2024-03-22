package com.example.eserciziolibreriaweb.service;

import com.example.eserciziolibreriaweb.entity.Book;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
@Service
public class BookService {
    private ArrayList<Book> bookArrayList = new ArrayList<>();
    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }
    public Book addBook(Book book){
        bookArrayList.add(book);
        return book;
    }
}
