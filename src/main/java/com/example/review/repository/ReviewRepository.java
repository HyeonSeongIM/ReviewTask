package com.example.review.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.review.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer>{
}
