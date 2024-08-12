package com.example.review.service;


import com.example.review.entity.Review;

import java.util.Optional;

/** Review 서비스 : review */
public interface ReviewService {
    // 책 등록
    void bookUpdate(Review review);

    // 책 조회
    Optional<Review> getReviewById(Integer id);

    // 사용자 등록
    void idUpdate(Integer id);

    // 사용자 마다 등록할 수 있도록 기능 구현
    Optional<Review> updateReview(Review review);

    // 리뷰 등록


    // 리뷰 조회
}
