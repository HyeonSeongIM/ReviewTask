package com.example.review.controller;


import com.example.review.entity.Book;
import com.example.review.entity.User;
import com.example.review.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/user/{userId}")
    public List<Book> getBookUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        return bookService.getBookUser(user);

    }
}
