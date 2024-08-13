package com.example.review.sevice;

import com.example.review.entity.Book;
import com.example.review.entity.User;

import java.util.List;

public interface BookService {

    /** 책 등록 */
    Book addBook(Book book);

    /** 책 리스트 + id */
    List<Book> getBookUser(User user);
}
