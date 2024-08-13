package com.example.review.sevice;


import com.example.review.entity.Book;
import com.example.review.entity.User;
import com.example.review.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBookUser(User user) {
        return bookRepository.findByUser(user);
    }
}
