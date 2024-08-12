package com.example.review.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    // 사용자 id
    private int id;

    // 사용자 비밀번호
    private String password;

    // 책 이름
    private String bookName;
}
