package com.example.review.repository;

import com.example.review.entity.Book;
import com.example.review.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByUser(User user);
}
