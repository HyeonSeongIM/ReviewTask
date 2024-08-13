package com.example.review.repository;

import com.example.review.entity.Book;
import com.example.review.entity.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    // 각 책 별로 리뷰를 남기니 book 사용
    List<Review> findByBook(Book book);
}
