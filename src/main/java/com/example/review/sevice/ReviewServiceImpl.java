package com.example.review.sevice;

import com.example.review.entity.Book;
import com.example.review.entity.Review;
import com.example.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReview(Book book) {
        return reviewRepository.findByBook(book);
    }
}
