package com.example.review.controller;


import com.example.review.entity.Book;
import com.example.review.entity.Review;
import com.example.review.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewController {

    /** 리뷰 책 조회 */
    @Id
    private Integer id;

    // 리뷰
    private String comment;

    // 유저 -> 리뷰
    private User user;

    // 북 -> 리뷰
    private Book book;
}
