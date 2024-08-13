package com.example.review.sevice;

import com.example.review.entity.Book;
import com.example.review.entity.Review;

import java.util.List;

public interface ReviewService {

    /** 리뷰 달기 */
    Review addReview(Review review);

    /** 리뷰 목록 */
    List<Review> getReview(Book book);
}
