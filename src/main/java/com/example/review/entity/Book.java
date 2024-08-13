package com.example.review.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    /** 책 등록 */
    // 책의 이름을 기본키로 설정
    @Id
    private String title;

    // 사용자마다 등록할 수 있게 userId 설정
    private User user;
}
