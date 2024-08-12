package com.example.review.service;

import com.example.review.entity.Review;
import com.example.review.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    // 인젝션 주입
    @Autowired
    ReviewRepository repository;

    @Override
    public void bookUpdate(Review review) {

    }

    @Override
    public Optional<Review> getReviewById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void idUpdate(Integer id) {

    }

    @Override
    public Optional<Review> updateReview(Review review) {
        return Optional.empty();
    }
}
